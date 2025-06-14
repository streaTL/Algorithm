import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        long[] arr = new long[k];
        while(st.hasMoreTokens()){
            pq.add(Integer.parseInt(st.nextToken()));
        }
        for(int i=0;i<k;i++){
            arr[i]=pq.poll();
        }
        long sum=0;
        while(!pq.isEmpty()){
            sum+=pq.poll();
        }

        Arrays.sort(arr);
        boolean b = false;
        while(sum>0){
            for(int i=0;i<k;i++){
                if(i==k-1){
                    b=true;
                    break;
                }
                if(arr[i]<arr[i+1]){
                    if((i+1)*(arr[i+1]-arr[i])>=sum){
                        System.out.println(arr[i]+sum/(i+1));
                        return;
                    }
                    else{
                        sum-=(i+1)*(arr[i+1]-arr[i]);
                        for(int j=0;j<=i;j++){
                            arr[j]=arr[i+1];
                        }
                    }
                }

            }
            if(b)
                break;
        }

        System.out.println(arr[0]+sum/k);
    }
}
