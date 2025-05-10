import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        char[][] crr = new char[a][a];
        int[][] max = new int[a][a];
        int[][] min = new int[a][a];
        for(int[] i : min)
            Arrays.fill(i,999999);
        for(int[] i : max)
            Arrays.fill(i,-999999);
        for(int i=0;i<a;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<a;j++){
                crr[i][j]=st.nextToken().charAt(0);
            }
        }
        max[0][0]=crr[0][0]-'0';
        min[0][0]=crr[0][0]-'0';
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        q1.add(0);
        q2.add(0);
        while(!q1.isEmpty()){
            int x = q1.poll();
            int y = q2.poll();
            if(crr[x][y]>='0'){
                if(x+1<a&&max[x+1][y]<max[x][y]){
                    max[x+1][y]=max[x][y];
                    q1.add(x+1);
                    q2.add(y);
                }
                if(y+1<a&&max[x][y+1]<max[x][y]){
                    max[x][y+1]=max[x][y];
                    q1.add(x);
                    q2.add(y+1);
                }
                if(x+1<a&&min[x+1][y]>min[x][y]){
                    min[x+1][y]=min[x][y];
                    q1.add(x+1);
                    q2.add(y);
                }
                if(y+1<a&&min[x][y+1]>min[x][y]){
                    min[x][y+1]=min[x][y];
                    q1.add(x);
                    q2.add(y+1);
                }
            }
            else if(crr[x][y]=='+'){
                if(x+1<a&&max[x+1][y]<max[x][y]+(crr[x+1][y]-'0')){
                    max[x+1][y]=max[x][y]+(crr[x+1][y]-'0');
                    q1.add(x+1);
                    q2.add(y);
                }
                if(y+1<a&&max[x][y+1]<max[x][y]+(crr[x][y+1]-'0')){
                    max[x][y+1]=max[x][y]+(crr[x][y+1]-'0');
                    q1.add(x);
                    q2.add(y+1);
                }
                if(x+1<a&&min[x+1][y]>min[x][y]+(crr[x+1][y]-'0')){
                    min[x+1][y]=min[x][y]+(crr[x+1][y]-'0');
                    q1.add(x+1);
                    q2.add(y);
                }
                if(y+1<a&&min[x][y+1]>min[x][y]+(crr[x][y+1]-'0')){
                    min[x][y+1]=min[x][y]+(crr[x][y+1]-'0');
                    q1.add(x);
                    q2.add(y+1);
                }
            }
            else if(crr[x][y]=='-'){
                if(x+1<a&&max[x+1][y]<max[x][y]-(crr[x+1][y]-'0')){
                    max[x+1][y]=max[x][y]-(crr[x+1][y]-'0');
                    q1.add(x+1);
                    q2.add(y);
                }
                if(y+1<a&&max[x][y+1]<max[x][y]-(crr[x][y+1]-'0')){
                    max[x][y+1]=max[x][y]-(crr[x][y+1]-'0');
                    q1.add(x);
                    q2.add(y+1);
                }
                if(x+1<a&&min[x+1][y]>min[x][y]-(crr[x+1][y]-'0')){
                    min[x+1][y]=min[x][y]-(crr[x+1][y]-'0');
                    q1.add(x+1);
                    q2.add(y);
                }
                if(y+1<a&&min[x][y+1]>min[x][y]-(crr[x][y+1]-'0')){
                    min[x][y+1]=min[x][y]-(crr[x][y+1]-'0');
                    q1.add(x);
                    q2.add(y+1);
                }
            }
            else if(crr[x][y]=='*'){
                if(x+1<a&&max[x+1][y]<max[x][y]*(crr[x+1][y]-'0')){
                    max[x+1][y]=max[x][y]*(crr[x+1][y]-'0');
                    q1.add(x+1);
                    q2.add(y);
                }
                if(y+1<a&&max[x][y+1]<max[x][y]*(crr[x][y+1]-'0')){
                    max[x][y+1]=max[x][y]*(crr[x][y+1]-'0');
                    q1.add(x);
                    q2.add(y+1);
                }
                if(x+1<a&&min[x+1][y]>min[x][y]*(crr[x+1][y]-'0')){
                    min[x+1][y]=min[x][y]*(crr[x+1][y]-'0');
                    q1.add(x+1);
                    q2.add(y);
                }
                if(y+1<a&&min[x][y+1]>min[x][y]*(crr[x][y+1]-'0')){
                    min[x][y+1]=min[x][y]*(crr[x][y+1]-'0');
                    q1.add(x);
                    q2.add(y+1);
                }
            }
        }
        System.out.print(max[a-1][a-1]+" "+min[a-1][a-1]);
        
    }
}