import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[][] arr = new int[a][2];
        for(int i=0;i<a;i++){
            st=new StringTokenizer(br.readLine());
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr,(x,y)->y[0]==x[0]?y[1]-x[1]:x[0]-y[0]);
        boolean[] brr = new boolean[a];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<b;i++){
            pq.add(Integer.parseInt(br.readLine()));
        }
        long res=0;

        for(int i=0;i<a;i++){
            if(pq.isEmpty())
                break;
            if(arr[i][0]<=pq.peek()){
                pq2.add(arr[i][1]);
            }
            else{
                if(!pq2.isEmpty()){
                    res+=pq2.poll();
                }
                pq.poll();
                i--;
            }
        }
        while(!pq.isEmpty()&&!pq2.isEmpty()){
            res+=pq2.poll();
            pq.poll();
        }
        System.out.println(res);
    }
}
