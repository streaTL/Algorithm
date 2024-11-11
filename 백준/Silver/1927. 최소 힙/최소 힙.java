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
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<a;i++){
            st=new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st.nextToken());
            if(b==0){
                if(pq.isEmpty())
                    System.out.println(0);
                else System.out.println(pq.poll());
            }
            else pq.add(b);
        }

    }
}
