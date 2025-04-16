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
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];
        boolean[][] brr = new boolean[n][m];
        int[] xx = new int[]{1,-1,0,0};
        int[] yy = new int[]{0,0,1,-1};
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        for(int i=0;i<n;i++){
            String s = br.readLine();
            for(int j=0;j<m;j++){
                if(s.charAt(j)=='*'){
                    q1.add(i);
                    q2.add(j);
                    brr[i][j]=true;
                } else if (s.charAt(j)=='#') {
                    arr[i][j]=b+1;
                }
            }
        }
        int count=0;
        ArrayList<ArrayList<int[]>> ar = new ArrayList<>();
        for(int i=0;i<a;i++){
            ar.add(new ArrayList<>());
        }
        while(true){
            if(count==a)
                break;
            int num = q1.size();
            for(int i=0;i<num;i++){
                int x = q1.poll();
                int y = q2.poll();
                for(int j=0;j<4;j++){
                    int zx = x+xx[j];
                    int zy = y+yy[j];
                    if(zx>=0&&zx<n&&zy>=0&&zy<m&&!brr[zx][zy]){
                        brr[zx][zy]=true;
                        if(arr[zx][zy]>0){
                            if(count+b>=a)
                                continue;
                            ar.get(count+b).add(new int[]{zx,zy});
                            continue;
                        }
                        q1.add(zx);
                        q2.add(zy);
                    }
                }
            }
            for(int[] k :ar.get(count)){
                q1.add(k[0]);
                q2.add(k[1]);
                arr[k[0]][k[1]]=0;
            }
            count++;
        }
        int f=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]!=0||!brr[i][j]){
                    f++;
                    sb.append((i+1)+" "+(j+1)+"\n");
                }
            }
        }
        if(f==0)
            System.out.println(-1);
        else System.out.println(sb);
    }
}
