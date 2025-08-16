import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            String s = br.readLine();
            for(int j=0;j<m;j++){
                arr[i][j]=s.charAt(j)-'0';
            }
        }
        int max = 0;
        int total = 1<<(n*m);
        for (int x=0;x<total;x++){
            int sum = 0;
            for (int i=0;i<n;i++){
                int res = 0;
                for (int j=0;j<m;j++){
                    int y = i*m+j;
                    if ((x&(1<<y))==0){
                        res = res*10+arr[i][j];
                    } else {
                        sum+=res;
                        res=0;
                    }
                }
                sum+=res;
            }
            for (int j=0;j<m;j++){
                int res=0;
                for (int i=0;i<n;i++){
                    int y = i*m+j;
                    if ((x&(1<<y))!=0){
                        res = res*10+arr[i][j];
                    }else{
                        sum+=res;
                        res=0;
                    }
                }
                sum+=res;
            }

            max = Math.max(max,sum);
        }

        System.out.println(max);

    }

}
