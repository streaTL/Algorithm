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
        int[] arr = new int[a];
        int[] arr2 = new int[a];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        st = new StringTokenizer(br.readLine());
        HashMap<Integer,Integer> hs = new HashMap<>();
        HashMap<Integer,Integer> hs2 = new HashMap<>();
        for(int i=0;i<a;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            arr2[i]=arr[i];
            hs2.put(arr[i],i);
            pq.add(arr[i]);
        }
        Arrays.sort(arr2);
        for(int i=0;i<a;i++){
            hs.put(arr2[i],i);
        }
        int res=0;
        int c = a-1;
        while(!pq.isEmpty()){
            if(res==b)
                break;
            int x = pq.poll();
            if(hs2.get(x)==c){
                c--;
                continue;
            }
            arr[hs2.get(x)]=arr[c];
            arr[c]=x;
            res++;
            c--;
            hs2.replace(arr[hs2.get(x)],hs2.get(x));
        }
        if(res==b){
            for(int i : arr)
                System.out.print(i+" ");
        }
        else System.out.println(-1);
    }
}
