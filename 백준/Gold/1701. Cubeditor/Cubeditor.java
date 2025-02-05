import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) { // 모든 접미사에 대해 수행
            maxLength = Math.max(maxLength, computeLPS(s.substring(i))); // LPS 최대값 갱신
        }

        System.out.println(maxLength);
    }

    // LPS 배열을 계산하는 함수 (KMP 알고리즘 활용)
    public static int computeLPS(String s) {
        int n = s.length();
        int[] lps = new int[n];
        int j = 0; // 접두사 길이

        for (int i = 1; i < n; i++) {
            while (j > 0 && s.charAt(i) != s.charAt(j)) {
                j = lps[j - 1]; // 이전 LPS 값으로 이동
            }

            if (s.charAt(i) == s.charAt(j)) {
                j++;
                lps[i] = j; // LPS 배열 갱신
            }
        }

        int maxLPS = 0;
        for (int value : lps) {
            maxLPS = Math.max(maxLPS, value);
        }
        return maxLPS;
    }
}