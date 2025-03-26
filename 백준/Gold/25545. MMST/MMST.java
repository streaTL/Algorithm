import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] parent;
    static int[] rank;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 만약 간선 수가 n-1이면 이미 유일한 트리이므로 대안 신장트리 없음.
        if(m == n - 1) {
            System.out.println("NO");
            return;
        }

        // 간선 정보 저장: 각 간선은 {u, v, w, index}
        int[][] edges = new int[m+1][4];
        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            edges[i][0] = u;
            edges[i][1] = v;
            edges[i][2] = w;
            edges[i][3] = i;
        }

        // 간선을 가중치 순으로 정렬 (Kruskal 용)
        List<int[]> sortedEdges = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            sortedEdges.add(new int[]{edges[i][0], edges[i][1], edges[i][2], edges[i][3]});
        }
        Collections.sort(sortedEdges, (x, y) -> x[2] - y[2]);

        // MST 구하기 (Kruskal 알고리즘)
        boolean[] used = new boolean[m+1];  // MST에 사용된 간선 표시
        int[] mstEdges = new int[n-1];       // MST에 포함된 간선 번호들 저장
        initUnionFind(n);
        int cnt = 0;
        for (int[] e : sortedEdges) {
            if (cnt == n - 1) break;
            if(find(e[0]) != find(e[1])) {
                union(e[0], e[1]);
                mstEdges[cnt] = e[3];
                used[e[3]] = true;
                cnt++;
            }
        }
        // 만약 MST를 완성하지 못했다면 연결 그래프가 아님.
        if(cnt < n - 1) {
            System.out.println("NO");
            return;
        }

        // MST에 사용되지 않은 간선 중 가장 작은 번호의 간선을 강제 선택
        int forcedEdge = -1;
        for (int i = 1; i <= m; i++) {
            if(!used[i]) {
                forcedEdge = i;
                break;
            }
        }
        // 모든 간선이 MST에 사용되었다면 대안이 없음.
        if(forcedEdge == -1) {
            System.out.println("NO");
            return;
        }

        // forcedEdge를 포함하는 새로운 신장트리 구성
        List<Integer> ansEdges = new ArrayList<>();
        initUnionFind(n);  // union-find 초기화
        // forcedEdge 먼저 포함
        int[] fe = edges[forcedEdge];
        union(fe[0], fe[1]);
        ansEdges.add(forcedEdge);

        // 나머지 간선을 순서대로 추가 (forcedEdge 제외)
        for (int[] e : sortedEdges) {
            if(ansEdges.size() == n - 1) break;
            if(e[3] == forcedEdge) continue;
            if(find(e[0]) != find(e[1])) {
                union(e[0], e[1]);
                ansEdges.add(e[3]);
            }
        }

        if(ansEdges.size() < n - 1) {
            System.out.println("NO");
            return;
        }
        Collections.sort(ansEdges);
        System.out.println("YES");
        StringBuilder sb = new StringBuilder();
        for (int idx : ansEdges) {
            sb.append(idx).append(" ");
        }
        System.out.println(sb.toString().trim());
    }

    // union-find 초기화
    static void initUnionFind(int n) {
        parent = new int[n+1];
        rank = new int[n+1];
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    // 경로 압축 적용 find
    static int find(int x) {
        if(parent[x] != x) parent[x] = find(parent[x]);
        return parent[x];
    }

    // union by rank 적용
    static void union(int x, int y) {
        int rx = find(x);
        int ry = find(y);
        if(rx == ry) return;
        if(rank[rx] < rank[ry]) {
            parent[rx] = ry;
        } else if(rank[rx] > rank[ry]) {
            parent[ry] = rx;
        } else {
            parent[ry] = rx;
            rank[rx]++;
        }
    }
}
