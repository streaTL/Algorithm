import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<a;i++){
            int b = Integer.parseInt(br.readLine());
            if(b!=0)
                pq.add(b);
            else{
                if(!pq.isEmpty())
                    sb.append(pq.poll()).append("\n");
                else sb.append(0).append("\n");
            }
        }
        System.out.println(sb);
    }
}
