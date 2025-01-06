import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st=new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        if(c==0){
            System.out.println(b);
            return;
        }
        boolean[] brr = new boolean[a+1];
        boolean[][] brr2 = new boolean[a+1][a+1];
        for(int i=0;i<c;i++){
            brr[Integer.parseInt(st.nextToken())]=true;
        }

        int[][] arr = new int[51][51];
        for(int i=0;i<b;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            arr[i][0]=x;
            for(int j=1;j<=x;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
//        for(int[]i:arr){
//            for(int j:i)
//                System.out.print(j+" ");
//            System.out.println();
//        }
        int res=0;
        for(int i=0;i<b;i++){
            int x = arr[i][0];
            for(int j=1;j<=x;j++){
                for(int k=1;k<=x;k++){
                    brr2[arr[i][j]][arr[i][k]]=true;
                }
            }
        }
//        for(boolean[] i : brr2){
//            for(boolean j : i){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=a;i++){
            if(brr[i])
                q.add(i);
        }
        while(!q.isEmpty()){
            int x = q.poll();
            for(int i=1;i<=a;i++){
                if(i==x)
                    continue;
                if(brr2[x][i]&&!brr[i]){
                    q.add(i);
                    brr[i]=true;
                }
            }
        }
//        System.out.println();
//        for(boolean i : brr)
//            System.out.print(i+" ");
        for(int i=0;i<b;i++){
            int x=0;
            for(int j=1;j<=arr[i][0];j++){
                if(brr[arr[i][j]])
                    x++;
            }
            if(x==0)
                res++;
        }


        System.out.println(res);
    }
}
