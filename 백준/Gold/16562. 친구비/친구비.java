import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] mn = new int[n+1];
        int res=0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((x,y)->x[1]-y[1]);
        st = new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++){
            int x = Integer.parseInt(st.nextToken());
            mn[i]=x;
            pq.add(new int[]{i,x});
        }

        ArrayList<ArrayList<Integer>> ar = new ArrayList<>();
        for(int i=0;i<=n;i++){
            ar.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            ar.get(x).add(y);
            ar.get(y).add(x);
        }
        boolean[] brr = new boolean[n+1];
        while(!pq.isEmpty()){
            int[] xrr = pq.poll();
            if(!brr[xrr[0]]){
                Queue<Integer> q = new ArrayDeque<>();
                q.add(xrr[0]);
                brr[xrr[0]]=true;
                res+=xrr[1];
                while(!q.isEmpty()){
                    int x = q.poll();
                    for(int i : ar.get(x)){
                        if(!brr[i]){
                            brr[i]=true;
                            q.add(i);
                        }
                    }
                }
            }
        }

        System.out.println(res<=k?res:"Oh no");

    }
}
