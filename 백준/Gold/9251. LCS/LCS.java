import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        st = new StringTokenizer(br.readLine());
        String b = st.nextToken();

        int[][]arr1 = new int[a.length()+1][b.length()+1];
        for(int i=1;i<=a.length();i++){
            for(int j=1;j<=b.length();j++){
                if(a.charAt(i-1)==b.charAt(j-1)){
//                    int x=0;
//                    for(int k=1;k<j;k++){
//                        x=Math.max(x,arr1[i-1][k]);
//                    }
//                    arr1[i][j]=x+1;
                    arr1[i][j]=arr1[i-1][j-1]+1;
                }
                else{
                    arr1[i][j]=Math.max(arr1[i-1][j],arr1[i][j-1]);
                }
            }
        }
        int res=0;
        for(int i=1;i<=a.length();i++){
            for(int j=1;j<=b.length();j++) {
                res=Math.max(res,arr1[i][j]);
            }
        }
        System.out.println(res);
    }
}
