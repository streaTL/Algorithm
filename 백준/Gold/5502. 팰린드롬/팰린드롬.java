import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int[][] crr = new int[a+1][a+1];
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
                if(s.charAt(i-1)==s.charAt(a-j)){
                    crr[i][j]=crr[i-1][j-1]+1;
                }
                else {
                    crr[i][j]=Math.max(crr[i-1][j],crr[i][j-1]);
                }
            }
        }
        System.out.println(a-crr[a][a]);
    }
}
