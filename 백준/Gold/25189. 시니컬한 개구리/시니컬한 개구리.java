import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = {-1, 1, 0, 0}; // 값을 곱하는 식으로 처리하면 상하좌우 방식을 그대로 써도 됨
    static int[] dy = {0, 0, -1, 1};
    static int N, M;
    static int[][] arr;
    static boolean [] r;
    static boolean [] l;
    static boolean[][][] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N][M];
        r = new boolean[N];
        l = new boolean[M];
        visited = new boolean[N][M][2]; // 기본점프와 슈퍼점프 구분 방문체크를 위해 3차원배열
        st = new StringTokenizer(br.readLine());
        int sx = Integer.parseInt(st.nextToken()) - 1;
        int sy = Integer.parseInt(st.nextToken()) - 1;
        int ex = Integer.parseInt(st.nextToken()) - 1;
        int ey = Integer.parseInt(st.nextToken()) - 1;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(bfs(sx, sy, ex, ey));
    }
    public static int bfs(int sx, int sy, int ex, int ey) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{sx, sy, 0, 0}); // 큐를 여러개 쓰는것 보다 배열 큐를 사용하자
        visited[sx][sy][0] = true;
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0], y = cur[1], jumps = cur[2], used = cur[3];
            if (x == ex && y == ey) return jumps; // 도착 시 종료
            int n = arr[x][y]; // 현재 칸에서의 기본 점프 거리
            // 기본점프
            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d] * n;
                int ny = y + dy[d] * n;
                if (isValid(nx, ny) && !visited[nx][ny][used]) {
                    visited[nx][ny][used] = true;
                    queue.add(new int[]{nx, ny, jumps + 1, used});
                }
            }
            // 슈퍼점프
            if (used == 0) {
                if(!l[y]){
                    for (int nx = 0; nx < N; nx++) {
                        if (nx != x && !visited[nx][y][1]) {
                            visited[nx][y][1] = true;
                            queue.add(new int[]{nx, y, jumps + 1, 1});
                        }
                    }
                    l[y]=true;
                }
                if(!r[x]){
                    for (int ny = 0; ny < M; ny++) {
                        if (ny != y && !visited[x][ny][1]) {
                            visited[x][ny][1] = true;
                            queue.add(new int[]{x, ny, jumps + 1, 1});
                        }
                    }
                    r[x]=true;
                }
            }
        }
        return -1; // 도달할 수 없는 경우
    }

    public static boolean isValid(int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < M;
    }
}