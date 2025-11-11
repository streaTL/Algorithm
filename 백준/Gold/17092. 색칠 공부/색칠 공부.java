import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        HashMap<Long,Integer> hm = new HashMap<>();
        Queue<Long> q = new LinkedList<>();
        long[] arr = new long[10];
        for(int t=0;t<n;t++){
            st = new StringTokenizer(br.readLine());
            long x = Integer.parseInt(st.nextToken());
            long y = Integer.parseInt(st.nextToken());
            for(long i=-2;i<=0;i++){
                for(long j=-2;j<=0;j++){
                    if(x+i>=1&&y+j>=1&&x+i<=h-2&&y+j<=w-2){
                        long z = (x+i)*1000000000+y+j;
                        if(hm.containsKey(z)){
                            hm.replace(z,hm.get(z)+1);
                        }
                        else{
                            hm.put(z,1);
                            q.add(z);
                        }
                    }
                }
            }
        }
        while(!q.isEmpty()){
            arr[hm.get(q.poll())]++;
        }
        arr[0]=(long)(h-2)*(long)(w-2);
        for(int i=1;i<10;i++){
            arr[0]-=arr[i];
        }
        for(long i : arr){
            System.out.println(i);
        }
    }
}
