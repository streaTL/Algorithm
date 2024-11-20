import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        StringTokenizer st;
        int count=0;
        while(true){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            if(a==0)
                break;
            count++;
            int[][] arr = new int[a][a];
            int[][] arr2 = new int[a][a];
            for(int i=0;i<a;i++){
                st=new StringTokenizer(br.readLine());
                for(int j=0;j<a;j++){
                    arr[i][j]=Integer.parseInt(st.nextToken());
                    arr2[i][j]=100000;
                }
            }
            int[] x = new int[]{0,0,1,-1};
            int[] y = new int[]{1,-1,0,0};
            arr2[0][0]=arr[0][0];
            Queue<Integer> q1 = new LinkedList<>();
            Queue<Integer> q2 = new LinkedList<>();
            q1.add(0);
            q2.add(0);
            while(!q1.isEmpty()){
                int f=q1.peek();
                int g=q2.peek();
                for(int i=0;i<4;i++){
                    if(f+x[i]>=0&&f+x[i]<a&&g+y[i]>=0&&g+y[i]<a){
                        if(arr2[f][g]+arr[f+x[i]][g+y[i]]<arr2[f+x[i]][g+y[i]]){
                            arr2[f+x[i]][g+y[i]]=arr2[f][g]+arr[f+x[i]][g+y[i]];
                            q1.add(f+x[i]);
                            q2.add(g+y[i]);
                        }
                    }
                }
                q1.poll();
                q2.poll();
            }
            System.out.println("Problem "+count+": "+arr2[a-1][a-1]);
        }

    }
}
