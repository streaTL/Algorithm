import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        for(int i=0;i<a;i++){
//            pq.add(Integer.parseInt(br.readLine()));
//        }
        int[] arr = new int[a];
        for(int i=0;i<a;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(int i : arr)
            sb.append(i+"\n");
//        while(!pq.isEmpty())
//            sb.append(pq.poll()+"\n");
        System.out.println(sb);
    }
}
