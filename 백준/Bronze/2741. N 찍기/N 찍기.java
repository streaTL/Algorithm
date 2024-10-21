import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int co = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=co;i++){
            sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}
