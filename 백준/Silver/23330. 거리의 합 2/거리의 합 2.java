import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] x = new long[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            x[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(x);
        long[] prefixSum = new long[n];
        prefixSum[0] = x[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + x[i];
        }

        long total = 0;
        for (int i = 1; i < n; i++) {
            total += x[i] * i - prefixSum[i - 1];
        }

        System.out.println(total * 2);
    }
}