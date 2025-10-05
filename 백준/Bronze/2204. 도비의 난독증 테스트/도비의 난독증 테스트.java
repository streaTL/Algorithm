import java.io.*;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int a = Integer.parseInt(br.readLine());
            if(a==0)
                break;
            String res = "";
            PriorityQueue<String> pq = new PriorityQueue<>();
            for(int i=0;i<a;i++){
                String s = br.readLine();
                String x = s.toUpperCase();
                pq.add(x);
                if(pq.peek().equals(x))
                    res=s;
            }
            System.out.println(res);
        }
    }
}
