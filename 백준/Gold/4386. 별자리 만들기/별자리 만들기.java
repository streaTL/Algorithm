import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        double[][] drr = new double[a][2];
        double res = 0;
        int[] arr = new int[a];
        Arrays.fill(arr,-1);
        for(int i=0;i<a;i++){
            st = new StringTokenizer(br.readLine());
            double x = Double.parseDouble(st.nextToken());
            double y = Double.parseDouble(st.nextToken());
            drr[i][0]=x;
            drr[i][1]=y;
        }
        PriorityQueue<double[]> pq = new PriorityQueue<>(Comparator.comparingDouble(x->x[2]));
        for(int i=0;i<a-1;i++){
            for(int j=i+1;j<a;j++){
                pq.add(new double[]{(double)i,(double)j,Math.sqrt(Math.pow(Math.abs(drr[i][0]-drr[j][0]),2)+Math.pow(Math.abs(drr[i][1]-drr[j][1]),2))});
            }
        }
        while(!pq.isEmpty()){
            double[] d = pq.poll();
            int x = (int)d[0];
            int y = (int)d[1];
            double z = d[2];
            if(arr[x]==-1&&arr[y]==-1){
                res+=z;
                arr[x]=x;
                arr[y]=x;
            }
            else if(arr[x]==-1){
                res+=z;
                arr[x]=arr[y];
            }
            else if(arr[y]==-1){
                res+=z;
                arr[y]=arr[x];
            }
            else if(arr[x]!=arr[y]){
                int b = arr[x];
                res+=z;
                for(int i=0;i<a;i++){
                    if(arr[i]==b)
                        arr[i]=arr[y];
                }
            }
        }

        System.out.printf("%.2f",res);

    }

}
