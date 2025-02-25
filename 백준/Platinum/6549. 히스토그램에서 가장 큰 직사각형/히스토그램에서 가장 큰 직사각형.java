import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while(true){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            if(a==0){
                System.out.println(sb);
                break;
            }
            else{
                int[] arr = new int[a];
                for(int i=0;i<a;i++){
                    arr[i]=Integer.parseInt(st.nextToken());
                }
                sb.append(get(a,arr)+"\n");
            }
        }
    }
    private static long get(int n, int[] arr){
        long res=0;
        Stack<long[]> stt = new Stack<>();
        for(int i=0;i<n;i++){
            long start = i;
            while(!stt.isEmpty()&&stt.peek()[1]>arr[i]) {
                long[] pop = stt.pop();
                long x = pop[0], y = pop[1];
                res = Math.max(res,(i-x)*y);
                start = x;
            }
            stt.push(new long[]{start,arr[i]});
        }

        while (!stt.isEmpty()){
            long[] pop = stt.pop();
            long x = pop[0], y = pop[1];
            res = Math.max(res,(n-x)*y);
        }
        return res;
    }
}
