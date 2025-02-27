import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();

        int[][] arr = new int[s1.length()+1][s2.length()+1];
        for(int i=1;i<=s1.length();i++){
            for(int j=1;j<=s2.length();j++){
                if(s1.charAt(i-1)==s2.charAt(j-1))
                    arr[i][j]=arr[i-1][j-1]+1;
            }
        }
        int res=0;
        for(int i=1;i<=s1.length();i++){
            for(int j=1;j<=s2.length();j++) {
                res = Math.max(res, arr[i][j]);
            }
        }
        System.out.println(res);
    }
}
