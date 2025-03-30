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
        long c = Long.parseLong(st.nextToken());
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<a;i++){
            int x = Integer.parseInt(st.nextToken());
            pq1.add(x);
        }
        int res = 0;
        Stack<Integer> stt = new Stack<>();
        while(!pq1.isEmpty()){
            if(res==b)
                break;
            int x = pq1.peek();
            if(x<c){
                stt.push(x);
                pq1.poll();
            }
            else{
                if(stt.isEmpty())
                    break;
                c+=stt.pop();
                res++;
            }
        }
        while(!stt.isEmpty()){
            if(res==b)
                break;
            c+=stt.pop();
            res++;
        }
        System.out.println(c);
    }
}
