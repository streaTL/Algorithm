import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());

        int[][] arr = new int[a][2];
        for(int i=0;i<a;i++){
            st=new StringTokenizer(br.readLine());
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());
            if(x>y){
                arr[i][0]=y;
                arr[i][1]=x;
            }
            else{
                arr[i][1]=y;
                arr[i][0]=x;
            }

        }
        st=new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken());

        int sum=0;
        Arrays.sort(arr,(x,y)->x[1]==y[1]?x[0]-y[0]:x[1]-y[1]);
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0;i<a;i++){
            if(arr[i][0]>=arr[i][1]-b){
                pq.add(arr[i][0]);
            }
            while(!pq.isEmpty()){
                if(pq.peek()<arr[i][1]-b)
                    pq.poll();
                else break;
            }
            sum=Math.max(sum,pq.size());
        }



        System.out.println(sum);
    }
}
