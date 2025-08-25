import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()); // 요양 가능 횟수
        int b = Integer.parseInt(st.nextToken()); // 공부 최소 횟수

        int[][] arr = new int[n][4];
        for (int i= 0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken()); // 정독실
            arr[i][1] = Integer.parseInt(st.nextToken()); // 소학습실
            arr[i][2] = Integer.parseInt(st.nextToken()); // 휴게실
            arr[i][3] = Integer.parseInt(st.nextToken()); // 요양
        }
        int mi = Integer.MIN_VALUE;
        long[][][] prev = new long[a+1][b+1][2];
        for (int i=0;i<=a;i++) {
            for (int j=0;j<=b;j++) {
                prev[i][j][0] = mi;
                prev[i][j][1] = mi;
            }
        }
        prev[0][0][0] = 0;

        for (int day=0;day<n;day++) {
            long[][][] cur = new long[a+1][b+1][2];
            for (int i=0;i<=a;i++) {
                for (int j=0;j<=b;j++) {
                    cur[i][j][0] = mi;
                    cur[i][j][1] = mi;
                }
            }

            for (int used=0;used<=a;used++) {
                for (int study=0;study<=b;study++) {
                    for (int last=0;last<=1;last++) {
                        long val = prev[used][study][last];
                        if(val==mi) continue;

                        // 정독실
                        int ns = Math.min(b, study + 1);
                        cur[used][ns][0] = Math.max(cur[used][ns][0], val + arr[day][0]);

                        // 소학습실
                        cur[used][ns][0] = Math.max(cur[used][ns][0], val + arr[day][1]);

                        // 휴게실
                        if (last == 0) {
                            cur[used][study][1] = Math.max(cur[used][study][1], val + arr[day][2]);
                        }

                        // 요양
                        if (used + 1 <= a) {
                            cur[used + 1][study][0] = Math.max(cur[used + 1][study][0], val + arr[day][3]);
                        }
                    }
                }
            }
            prev = cur;
        }

        long ans = mi;
        for (int used = 0; used <= a; used++) {
            for (int last = 0; last <= 1; last++) {
                ans = Math.max(ans, prev[used][b][last]);
            }
        }

        System.out.println(ans);
    }
}
