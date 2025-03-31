import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[][] arr = new int[a][a];
        for(int i=0;i<a;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<a;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        int[]xx = new int[]{0,-1,-1,-1,0,1,1,1};
        int[]yy = new int[]{-1,-1,0,1,1,1,0,-1};
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        q1.add(a-1);
        q1.add(a-1);
        q1.add(a-2);
        q1.add(a-2);
        q2.add(0);
        q2.add(1);
        q2.add(0);
        q2.add(1);
        for(int tc=0;tc<b;tc++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = q1.size();
            for(int i=0;i<z;i++){
                int aa = q1.poll();
                int bb = q2.poll();
                int xxx = aa+y*xx[x-1];
                int yyy = bb+y*yy[x-1];
                xxx=xxx%a;
                if(xxx<0){
                    xxx=(xxx%a)+a;
                }
                else xxx=xxx%a;
                yyy=yyy%a;
                if(yyy<0){
                    yyy=(yyy%a)+a;
                }
                else yyy=yyy%a;
                q1.add(xxx);
                q2.add(yyy);
            }
            for(int i=0;i<z;i++){
                int aa = q1.poll();
                int bb = q2.poll();
                arr[aa][bb]++;
                q1.add(aa);
                q2.add(bb);
            }
            boolean[][] brr = new boolean[a][a];
            while(!q1.isEmpty()){
                int aa = q1.poll();
                int bb = q2.poll();
                brr[aa][bb]=true;
                for(int i=1;i<=7;i+=2){
                    int xxx = aa+xx[i];
                    int yyy = bb+yy[i];
                    if(xxx>=0&&xxx<a&&yyy>=0&&yyy<a&&arr[xxx][yyy]>0){
                        arr[aa][bb]++;
                        brr[aa][bb]=true;
                    }
                }
            }
            for(int i=0;i<a;i++){
                for(int j=0;j<a;j++){
                    if(arr[i][j]>1&&!brr[i][j]){
                        arr[i][j]-=2;
                        q1.add(i);
                        q2.add(j);
                    }
                }
            }
        }

        int res=0;
        for(int[] i : arr)
            for(int j : i)
                res+=j;
        System.out.println(res);
    }
}
