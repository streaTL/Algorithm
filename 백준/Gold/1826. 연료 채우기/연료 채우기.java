import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        PriorityQueue<int[]> pq1 = new PriorityQueue<>((x,y)->x[0]-y[0]);
        PriorityQueue<int[]> pq2 = new PriorityQueue<>((x,y)->y[1]-x[1]);
        for(int i=0;i<a;i++){
            st=new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            pq1.add(new int[]{b,c});
        }
        st = new StringTokenizer(br.readLine());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int count=0;
        while(true){
            if(pq1.isEmpty())
                break;
            if(pq1.peek()[0]<=c)
                pq2.add(pq1.poll());
            else break;
        }
        while(!pq2.isEmpty()){
            if(c>=b)
                break;
            c+=pq2.poll()[1];
            count++;
            while(true){
                if(pq1.isEmpty())
                    break;
                if(pq1.peek()[0]<=c)
                    pq2.add(pq1.poll());
                else break;
            }
        }
        if(c>=b)
            System.out.println(count);
        else System.out.println(-1);
    }
}
