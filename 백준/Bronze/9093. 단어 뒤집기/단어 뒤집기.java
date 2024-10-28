import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<a;i++){
            String[] s = br.readLine().split(" ");
            for(int j=0;j<s.length;j++){
                for(int k=s[j].length()-1;k>=0;k--){
                    sb.append(s[j].charAt(k));
                }
                sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
