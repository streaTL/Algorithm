import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
//    static boolean[][] brr;
//    static int sum=0;
//    static int rs=0;
    static int res=10000000;
    static int[][] arr2;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());

        int[][] arr = new int[a][3];
        arr2 = new int[a][3];

        for(int i=0;i<a;i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
            arr[i][2]=Integer.parseInt(st.nextToken());
        }

//        brr = new boolean[a][3];
//        dfs(0,arr,a);
        int aa=arr[0][0];
        int bb=arr[0][1];
        int cc=arr[0][2];
        arr[0][1]=100000000;
        arr[0][2]=100000000;
        for(int i=1;i<a;i++){
            arr2[i][0]=10000000;
            arr2[i][1]=10000000;
            arr2[i][2]=10000000;
        }
        arr2[0][0]=arr[0][0];
        arr2[0][1]=arr[0][1];
        arr2[0][2]=arr[0][2];
        for(int i=1;i<a;i++){
            for(int j=0;j<3;j++){
                for(int z=0;z<3;z++){
                    if(!(z==j)){
                        if(arr2[i-1][z]+arr[i][j]<arr2[i][j])
                            arr2[i][j]=arr2[i-1][z]+arr[i][j];
                    }
                }
            }
        }
        res=Math.min(arr2[a-1][1],res);
        res=Math.min(arr2[a-1][2],res);
        arr[0][0]=100000000;
        arr[0][1]=bb;
        arr[0][2]=100000000;
        for(int i=1;i<a;i++){
            arr2[i][0]=10000000;
            arr2[i][1]=10000000;
            arr2[i][2]=10000000;
        }
        arr2[0][0]=arr[0][0];
        arr2[0][1]=arr[0][1];
        arr2[0][2]=arr[0][2];
        for(int i=1;i<a;i++){
            for(int j=0;j<3;j++){
                for(int z=0;z<3;z++){
                    if(!(z==j)){
                        if(arr2[i-1][z]+arr[i][j]<arr2[i][j])
                            arr2[i][j]=arr2[i-1][z]+arr[i][j];
                    }
                }
            }
        }
        res=Math.min(arr2[a-1][0],res);
        res=Math.min(arr2[a-1][2],res);
        arr[0][1]=100000000;
        arr[0][0]=100000000;
        arr[0][2]=cc;
        for(int i=1;i<a;i++){
            arr2[i][0]=10000000;
            arr2[i][1]=10000000;
            arr2[i][2]=10000000;
        }
        arr2[0][0]=arr[0][0];
        arr2[0][1]=arr[0][1];
        arr2[0][2]=arr[0][2];
        for(int i=1;i<a;i++){
            for(int j=0;j<3;j++){
                for(int z=0;z<3;z++){
                    if(!(z==j)){
                        if(arr2[i-1][z]+arr[i][j]<arr2[i][j])
                            arr2[i][j]=arr2[i-1][z]+arr[i][j];
                    }
                }
            }
        }
        res=Math.min(arr2[a-1][1],res);
        res=Math.min(arr2[a-1][0],res);
//        System.out.println(aa+" "+bb+" "+cc);

        System.out.println(res);
    }
//    static void dfs(int a,int[][]arr,int n){
//        if(sum>res)
//            return;
//        if(a==n){
//            res=sum;
//            return;
//        }
//
//        for(int i=0;i<3;i++){
//            if(a==0){
//                sum+=arr[a][i];
//                brr[a][i]=true;
//                dfs(a+1,arr,n);
//                brr[a][i]=false;
//                sum-=arr[a][i];
//            }
//            else if(a==n-1){
//                if(!brr[0][i]&&!brr[a-1][i]){
//                    sum+=arr[a][i];
//                    dfs(a+1,arr,n);
//                    sum-=arr[a][i];
//                }
//            }
//            else if(!brr[a-1][i]){
//                sum+=arr[a][i];
//                brr[a][i]=true;
//                rs+=arr[a][i];
//                dfs(a+1,arr,n);
//                brr[a][i]=false;
//                sum-=arr[a][i];
//                rs-=arr[a][i];
//            }
//        }
//    }
}
