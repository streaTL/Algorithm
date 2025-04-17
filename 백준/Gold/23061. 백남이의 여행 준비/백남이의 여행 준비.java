import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][2];
        int max = 0;
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
        }
        int[] be = new int[m];
        for(int i=0;i<m;i++){
            be[i]=Integer.parseInt(br.readLine());
            max = Math.max(max,be[i]);
        }
        int[] beg = new int[max+1];
        int[] beg2 = new int[max+1];

        int x=0;
        for(int[] i : arr){
            if(x%2==0){
                for(int j=i[0];j<=max;j++){
                    beg2[j]=Math.max(beg[j],beg[j-i[0]]+i[1]);
                }
                for(int j=0;j<i[0];j++){
                    beg2[j]=beg[j];
                }
            }
            else {
                for(int j=i[0];j<=max;j++){
                    beg[j]=Math.max(beg2[j],beg2[j-i[0]]+i[1]);
                }
                for(int j=0;j<i[0];j++){
                    beg[j]=beg2[j];
                }
            }
            x++;
        }
        double res=0;
        int cu=1;
        if(x%2==0){
            for(int i=0;i<m;i++){
                if(res< (double)beg[be[i]]/be[i]){
                    res=(double)beg[be[i]]/be[i];
                    cu=i+1;
                }
            }
        }
        else{
            for(int i=0;i<m;i++){
                if(res< (double)beg2[be[i]]/be[i]){
                    res=(double)beg2[be[i]]/be[i];
                    cu=i+1;
                }
            }
        }
        System.out.println(cu);
    }
}
