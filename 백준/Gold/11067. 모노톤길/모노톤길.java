import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int TC = Integer.parseInt(st.nextToken());
        for(int t=0;t<TC;t++){
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[n][2];
            for(int i=0;i<n;i++){
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                arr[i][0]=a;
                arr[i][1]=b;
            }
            Arrays.sort(arr,(x,y)->x[0]-y[0]);
            ArrayList<Integer> ar = new ArrayList<>();
            int x=0;
            int y=0;
            int num=0;
            PriorityQueue<Integer> pq1 = new PriorityQueue<>();
            PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
            for(int m=0;m<n;m++){
                for(int i=num;i<n;i++){
                    if(arr[i][0]!=x){
                        num=i;
                        break;
                    }
                    pq1.add(arr[i][1]);
                    pq2.add(arr[i][1]);
                }
                if(pq1.peek()==y){
                    while(!pq1.isEmpty()){
                        ar.add(x);
                        ar.add(pq1.poll());
                    }
                    y=pq2.poll();
                    pq2.clear();
                }
                else if(pq2.peek()==y){
                    while(!pq2.isEmpty()){
                        ar.add(x);
                        ar.add(pq2.poll());
                    }
                    y=pq1.poll();
                    pq1.clear();
                }
                if(m==num)
                    break;
                m=num-1;
                x=arr[num][0];
            }
            st = new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st.nextToken());
            for(int i=0;i<c;i++){
                int v = Integer.parseInt(st.nextToken());
                System.out.println((ar.get((v-1)*2))+" "+(ar.get((v-1)*2+1)));
            }

        }

    }
}
