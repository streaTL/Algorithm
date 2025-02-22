import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static long[] seg, arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = (int)Math.ceil(Math.log(a)/Math.log(2));
        int size = (int)Math.pow(2,c+1);
        seg = new long[size];
        arr = new long [a+1];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<b;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            if(x==1){
                update(1,1,a,y,z);
            }
            else sb.append(pick(1,1,a,y,z)+"\n");
        }
        System.out.println(sb);
    }
    private static void update(int n, int start, int end, int idx, int num){
        if(start>idx||end<idx){
            return;
        }
        seg[n]+=num;
        if(start==end)
            return;
        update(n*2,start,(start+end)/2,idx,num);
        update(n*2+1,(start+end)/2+1,end,idx,num);
    }
    private static long pick(int n, int start, int end, int left, int right){
        if(start>right||end<left)
            return 0;
        if(start>=left&&end<=right){
            return seg[n];
        }
        return pick(n*2,start,(start+end)/2,left,right)+pick(n*2+1,(start+end)/2+1,end,left,right);
    }
}
