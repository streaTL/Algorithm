import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[][] arr = new int[a][b];
        int[][] arr2 = new int[a][b];
        int s1=0;
        int s2=0;
        for(int i=0;i<a;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<b;j++){
                int x = Integer.parseInt(st.nextToken());
                arr[i][j]=x;
                if(x==2){
                    s1=i;
                    s2=j;
                }
            }
        }
        int[] xx = new int[]{0,0,-1,1};
        int[] yy = new int[]{1,-1,0,0};
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        q1.add(s1);
        q2.add(s2);
        int c=0;
        while(!q1.isEmpty()){
            int si = q1.size();
            c++;
            for(int i=0;i<si;i++){
                int x = q1.poll();
                int y = q2.poll();
                for(int j=0;j<4;j++){
                    if(x+xx[j]>=0&&x+xx[j]<a&&y+yy[j]>=0&&y+yy[j]<b&&arr[x+xx[j]][y+yy[j]]==1&&arr2[x+xx[j]][y+yy[j]]==0){
                        arr2[x+xx[j]][y+yy[j]]=c;
                        q1.add(x+xx[j]);
                        q2.add(y+yy[j]);
                    }
                }
            }
        }
        arr2[s1][s2]=0;
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                if(arr2[i][j]==0&&arr[i][j]==1)
                    System.out.print("-1 ");
                else System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}