import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
        int[] arr = new int[a];
        for(int i=0;i<a;i++){
            int x = Integer.parseInt(st.nextToken());
            pq1.add(x);
            arr[i]=x;
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<a;i++){
            pq2.add(Integer.parseInt(st.nextToken()));
        }
        HashMap<Integer,ArrayList<Integer>> hm = new HashMap<>();
        while(!pq1.isEmpty()){
            int x = pq1.poll();
            int y = pq2.poll();
            if(x>y){
                System.out.println(-1);
                return;
            }
            if(hm.containsKey(x)){
                hm.get(x).add(y);
            }
            else{
                hm.put(x,new ArrayList<>());
                hm.get(x).add(y);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<a;i++){
            sb.append(hm.get(arr[i]).get(0)+" ");
            hm.get(arr[i]).remove(0);
        }
        System.out.println(sb);
    }
}
