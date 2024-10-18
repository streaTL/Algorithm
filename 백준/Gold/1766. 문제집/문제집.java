import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[][] arr = new int[b][2];
        ArrayList<ArrayList<Integer>> ar = new ArrayList<>();
        for(int i=0;i<=a;i++){
            ar.add(new ArrayList<>());
        }
        int[] br1 = new int[a+1];
        boolean[] br2 = new boolean[a+1];
        for(int i=0;i<b;i++){
            st=new StringTokenizer(br.readLine());
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
            ar.get(arr[i][0]).add(arr[i][1]);
            br1[arr[i][1]]++;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((x,y)->x-y);
        for(int i=1;i<=a;i++){
            if(br1[i]==0)
                pq.add(i);
        }
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            if(!br2[pq.peek()]){
                sb.append(pq.peek()).append(" ");
                br2[pq.peek()]=true;
                int x = pq.poll();
                for(int i : ar.get(x)){
                    br1[i]--;
                    if(br1[i]==0)
                        pq.add(i);
                }
            }
        }
        System.out.println(sb);
    }
}
