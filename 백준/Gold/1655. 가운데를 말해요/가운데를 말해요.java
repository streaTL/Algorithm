import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> q1 = new PriorityQueue<>();
        PriorityQueue<Integer> q2 = new PriorityQueue<>(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        //q1=max q2=min
        for(int i=0;i<a;i++){
            int b = Integer.parseInt(br.readLine());
            if(q2.isEmpty()){
                q2.offer(b);
                sb.append(b+"\n");
            }
            else if(q1.isEmpty()){
                if(b>q2.peek()){
                    q1.offer(b);
                    sb.append(q2.peek()+"\n");
                }
                else {
                    q1.offer(q2.poll());
                    q2.offer(b);
                    sb.append(b+"\n");
                }
            }
            else{
                if(b>q2.peek()){
                    q1.offer(b);
                    if(q1.size()>q2.size()){
                        q2.offer(q1.poll());
                    }
                    sb.append(q2.peek()+"\n");
                }
                else {
                    q2.offer(b);
                    if(q2.size()-q1.size()>1)
                        q1.offer(q2.poll());
                    sb.append(q2.peek()+"\n");
                }
            }
        }
        System.out.println(sb);
    }
}
