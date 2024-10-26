import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<int[]> ar1 = new ArrayList<>();
    static ArrayList<int[]> ar2 = new ArrayList<>();
    static int[] check;
    static int[] min;
    static int res=1000000000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
//        st=new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken());
        check=new int[b];

        int[][] arr = new int[a][a];

        for(int i=0;i<a;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<a;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
                if(arr[i][j]==1)
                    ar1.add(new int[]{i,j});
                else if(arr[i][j]==2)
                    ar2.add(new int[]{i,j});
            }
        }
        min=new int[ar1.size()];
        dfs(0,0,b);
        System.out.println(res);
    }
    public static void dfs(int a,int b,int c){
        if(a==c){
            Arrays.fill(min,100000000);
            for(int i=0;i<min.length;i++){
                for(int j=0;j< check.length;j++){
                    min[i]=Math.min(min[i],Math.abs(ar1.get(i)[0]-ar2.get(check[j])[0])+Math.abs(ar1.get(i)[1]-ar2.get(check[j])[1]));
                }
            }
            int t=0;
            for(int i : min){
//                System.out.print(i+" ");
                t+=i;
            }
//            System.out.println();
            res=Math.min(res,t);
            return;
        }
        for(int i=b;i<ar2.size();i++){
            check[a]=i;
            dfs(a+1,i+1,c);
        }
    }
}
