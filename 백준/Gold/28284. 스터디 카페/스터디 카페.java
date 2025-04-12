import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n + 2];
        int[] arr2 = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr2);
        for (int i = 1; i <= n; i++) {
            arr[i] = arr2[i - 1];
        }

        PriorityQueue<Integer> pqStart = new PriorityQueue<>();
        PriorityQueue<Integer> pqEnd = new PriorityQueue<>();

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            pqStart.add(s);
            pqEnd.add(e);
        }

        // 최소=처음부터 최대=끝부터
        int x = 0;
        int x2 = n + 1;
        // 요금 최소 최대, 합 최소 최대
        long sumMin = 0;
        long sumMax = 0;
        long resMin = 0;
        long resMax = 0;
        // 날짜저장
        int c = 0;

        while (!pqEnd.isEmpty()) {
            // 빠른 날짜 먼저
            if (pqStart.isEmpty() || pqStart.peek() > pqEnd.peek()) {
                int y = pqEnd.poll();
                // 종료 = 지금날짜-저장날짜+1 오늘도 포함이니까 +1
                resMin += sumMin * (y - c + 1);
                resMax += sumMax * (y - c + 1);
                // 다음 처리할 날짜는 y+1
                c = y + 1;
                // 저장하기
                sumMin -= arr[x];
                sumMax -= arr[x2];
                x--;    // 최소니까 --
                x2++;   // 최대니까 ++
            } else {
                int y = pqStart.poll();
                // 시작포함 안해서 y-c
                resMin += sumMin * (y - c);
                resMax += sumMax * (y - c);
                c = y;
                x++;
                x2--;
                sumMin += arr[x];
                sumMax += arr[x2];
            }
        }
        System.out.println(resMin + " " + resMax);
    }
}
