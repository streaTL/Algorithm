import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long x = 0;
        long y = a;

        while (y >= x) {
            long mid = (x + y) / 2;
            long left = mid + 1;
            long right = a - mid + 1;
            
            if (left > 0 && b / left < right) {
                y = mid - 1;
                continue;
            }

            long se = left * right;

            if (se == b) {
                System.out.println("YES");
                return;
            } else if (se < b) {
                x = mid + 1;
            } else {
                y = mid - 1;
            }
        }

        System.out.println("NO");
    }
}
