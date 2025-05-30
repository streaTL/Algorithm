import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int sum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int p=0;
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(sum<=a){
                sum+=b;
                pq.add(b);                
            }
            else{
                if(pq.peek()<=b){
                    p++;
                }
                else{
                    if(sum-pq.peek()>a)
                        p++;
                    else{
                        sum-=pq.poll();
                        p++;
                        sum+=b;
                        pq.add(b);
                    }
                }
            }
            if(p==2){
                System.out.print("Zzz");
                return;
            }
        }
        System.out.print("Kkeo-eok");
    }
}