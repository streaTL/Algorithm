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

        int[]arr = new int[a+1];
        Arrays.fill(arr,1000000000);
        arr[1]=0;
        ArrayList<ArrayList<Integer>> ar = new ArrayList<>();
        for(int i=0;i<=a;i++){
            ar.add(new ArrayList<>());
        }
        for(int i=0;i<b;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            ar.get(x).add(y);
            ar.get(x).add(z);
            ar.get(y).add(x);
            ar.get(y).add(z);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((x,y)->x[1]-y[1]);
        pq.add(new int[]{1,0});

        while(!pq.isEmpty()){
            int x = pq.peek()[0];
            int y = pq.peek()[1];
            for(int i=0;i<ar.get(x).size();i+=2){
                if(y+ar.get(x).get(i+1)<arr[ar.get(x).get(i)]){
                    arr[ar.get(x).get(i)]=y+ar.get(x).get(i+1);
                    pq.add(new int[]{ar.get(x).get(i),y+ar.get(x).get(i+1)});
                }
            }
            pq.poll();
        }
        System.out.println(arr[a]);
    }
}
