import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static long[] tree;
    static int size;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        long[] arr = new long[a+1];
        int c = (int)Math.ceil(Math.log(a)/Math.log(2));
        size = (int)Math.pow(2,c+1);
        tree = new long[size];
        for(int i=1;i<=a;i++){
            arr[i]=Long.parseLong(br.readLine());
        }
        StringBuilder sb = new StringBuilder();
        init(arr,1,1,a);
        for(int i=0;i<b+d;i++){
            st=new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            long z = Long.parseLong(st.nextToken());
            if(x==1){
                update(1,1,a,y,z-arr[y]);
                arr[y]=z;
            }
            else{
                sb.append(pick(1,1,a,y,(int)z)).append("\n");
            }
        }
        System.out.println(sb);
    }
    private static long init(long[] arr, int node, int start, int end){
        if(start==end){
            return tree[node]=arr[start];
        }
        return tree[node] = init(arr,node*2,start,(start+end)/2)+init(arr,node*2+1,(start+end)/2+1,end);
    }
    private static void update(int node, int start, int end, int idx, long m){
        if(idx>end||idx<start)
            return;
        tree[node]+=m;
        if(start != end) {
            update(node * 2, start, (start + end) / 2, idx, m);
            update(node * 2 + 1, (start + end) / 2 + 1, end, idx, m);
        }
    }
    private static long pick(int node, int start, int end, int left, int right){
        if(left>end||right<start){
            return 0;
        }
        if(left <= start && end <= right){
            return tree[node];
        }
        return pick(node*2, start, (start+end)/2, left, right)+pick(node*2+1, (start+end)/2+1, end, left, right);
    }
}
