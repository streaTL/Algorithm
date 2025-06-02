import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[][] brr = new boolean[n][n];
        boolean[][] brr2 = new boolean[n][n];
        Queue<int[]> q = new ArrayDeque<>();
        List<int[]> ar = new ArrayList<>();
        for(int i=0;i<n;i++){
            String s = br.readLine();
            for(int j=0;j<n;j++){
                if(s.charAt(j)=='X'){
//                    q.add(new int[]{i,j});
                    ar.add(new int[]{i,j});
                    brr[i][j]=true;
                }
            }
        }
        int[][] arr = new int[n][n];
        int[] xx = {-1,-1,0,0,1,1};
        int[] yy = {0,1,-1,1,-1,0};
        boolean[] cl = new boolean[8];
        int res=0;

        for(int[] k : ar){
            if(arr[k[0]][k[1]]==0){
                q.add(new int[]{k[0],k[1]});
                brr2[k[0]][k[1]]=true;
            }
            while(!q.isEmpty()){
                Arrays.fill(cl,false);
                int[] w = q.poll();
                for(int i=0;i<6;i++){
                    int xxx = w[0]+xx[i];
                    int yyy = w[1]+yy[i];
                    if(xxx>=0&&xxx<n&&yyy>=0&&yyy<n){
                        cl[arr[xxx][yyy]]=true;
                        if(brr[xxx][yyy]&&arr[xxx][yyy]==0&&!brr2[xxx][yyy]){
                            q.add(new int[]{xxx,yyy});
                            brr2[xxx][yyy]=true;
                        }
                    }
                }
                for(int i=1;i<8;i++){
                    if(!cl[i]){
                        arr[w[0]][w[1]]=i;
                        res = Math.max(res,i);
                        break;
                    }
                }
            }
        }


//        for(int[] i : arr){
//            for(int j : i)
//                System.out.print(j+" ");
//            System.out.println();
//        }

        if(res>3)
            System.out.println(3);
        else
            System.out.println(res);
    }
}