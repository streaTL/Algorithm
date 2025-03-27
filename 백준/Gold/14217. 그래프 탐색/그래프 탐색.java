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
        boolean[][] arr = new boolean[a+1][a+1];
        for(int i=0;i<b;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[x][y]=true;
            arr[y][x]=true;
        }
        for(int i=0;i<=a;i++){
            arr[i][i]=true;
        }
        StringBuilder sb = new StringBuilder();
        int c = Integer.parseInt(br.readLine());
        for(int n=0;n<c;n++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            if(x==1){
                arr[y][z]=true;
                arr[z][y]=true;
            }
            else {
                arr[y][z]=false;
                arr[z][y]=false;
            }
            int[] ar = new int[a+1];
            ar[1]=1;
            Queue<Integer> q = new LinkedList<>();
            q.add(1);
            while(!q.isEmpty()){
                int t = q.size();
                for(int i=0;i<t;i++){
                    int s = q.poll();
                    for(int j=1;j<=a;j++){
                        if(arr[s][j]&&ar[j]==0){
                            q.add(j);
                            ar[j]=ar[s]+1;
                        }
                    }
                }
            }
            for(int i=1;i<=a;i++){
                if(ar[i]==0)
                    sb.append(-1+" ");
                else sb.append(ar[i]-1+" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
