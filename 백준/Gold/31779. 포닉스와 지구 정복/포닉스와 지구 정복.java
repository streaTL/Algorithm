import java.util.*;

public class Main {
    static int N, M, K;
    static int[][] D;            // 변화량 행렬 (B - A)
    static boolean[][] volcano;  // 화산 위치 (true면 연산 불가능)
    static int[][] color;        // 이분 색칠: 0 또는 1, 미색칠은 -1
    static boolean[][] visited;

    // 4방향: 상, 하, 좌, 우
    static int[] dx = { -1, 1, 0, 0 };
    static int[] dy = { 0, 0, -1, 1 };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        K = sc.nextInt();

        int[][] A = new int[N][M];
        int[][] B = new int[N][M];
        D = new int[N][M];
        volcano = new boolean[N][M];
        color = new int[N][M];
        visited = new boolean[N][M];

        // A 입력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // B 입력 및 변화량 D 계산
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                B[i][j] = sc.nextInt();
                D[i][j] = B[i][j] - A[i][j];
            }
        }

        // 화산 위치 저장 및 화산 칸은 변화량이 0이어야 함
        for (int i = 0; i < K; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            volcano[x][y] = true;
            if (D[x][y] != 0) {
                System.out.println("No");
                return;
            }
        }

        // color 배열 초기화: -1은 아직 색칠되지 않음
        for (int i = 0; i < N; i++) {
            Arrays.fill(color[i], -1);
        }

        boolean possible = true;
        // 모든 비화산 칸에 대해 연결된 영역마다 검사
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!volcano[i][j] && !visited[i][j]) {
                    if (!checkComponent(i, j)) {
                        possible = false;
                        break;
                    }
                }
            }
            if (!possible) break;
        }

        System.out.println(possible ? "Yes" : "No");
    }

    // 연결된 영역 내에서 이분 색칠하고, 두 파티션의 변화량 합이 같은지 검사하는 함수
    static boolean checkComponent(int sx, int sy) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{sx, sy});
        visited[sx][sy] = true;
        color[sx][sy] = 0;

        long sum0 = 0, sum1 = 0;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0], y = cur[1];

            if (color[x][y] == 0) {
                sum0 += D[x][y];
            } else {
                sum1 += D[x][y];
            }

            // 4방향 탐색
            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d], ny = y + dy[d];
                if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
                if (volcano[nx][ny]) continue; // 화산 칸은 넘어감
                if (!visited[nx][ny]) {
                    visited[nx][ny] = true;
                    color[nx][ny] = 1 - color[x][y]; // 반대 색으로 지정
                    queue.offer(new int[]{nx, ny});
                } else {
                    // 이미 방문했는데 같은 색이면 이분 그래프가 아님 → 문제 조건상 발생하지 않아야 함
                    if (color[nx][ny] == color[x][y]) {
                        return false;
                    }
                }
            }
        }

        // 각 파티션의 합이 같아야 모든 칸을 0으로 만들 수 있음.
        return sum0 == sum1;
    }
}
