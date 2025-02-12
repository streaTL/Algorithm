import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        ArrayList<ArrayList<Integer>> ar = new ArrayList<>();
        for(int i=0;i<=N;i++){
            ar.add(new ArrayList<>());
        }

        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            ar.get(a).add(b);
            ar.get(a).add(c);
        }

        int[][] arr = new int[N+1][N+1];
        for(int i=0;i<=N;i++){
            Arrays.fill(arr[i],100000000);
        }
        for(int i=1;i<=N;i++){
            Queue<Integer> q = new LinkedList<>();
            q.add(i);
            arr[i][i]=0;
            while(!q.isEmpty()){
                int a = q.poll();
                for(int j=0;j<ar.get(a).size();j+=2){
                    if(arr[i][ar.get(a).get(j)]>arr[i][a]+ar.get(a).get(j+1)){
                        arr[i][ar.get(a).get(j)]=arr[i][a]+ar.get(a).get(j+1);
                        q.add(ar.get(a).get(j));
                    }
                }
            }
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=1;i<=N;i++){
            pq.add(arr[i][X]+arr[X][i]);
        }
        System.out.println(pq.poll());
    }
}
