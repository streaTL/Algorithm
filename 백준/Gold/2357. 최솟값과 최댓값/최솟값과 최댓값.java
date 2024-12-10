import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

///세그먼트트리 구현해보자

public class Main {
    static long[] tree;
    static long[] tree2;
    static int size;
    static PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
    static PriorityQueue<Long> pq2 = new PriorityQueue<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        long[] arr = new long[a+1];
        int c = (int)Math.ceil(Math.log(a)/Math.log(2));
        size = (int)Math.pow(2,c+1);
        tree = new long[size];
        tree2 = new long[size];
        for(int i=1;i<=a;i++){
            st=new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            arr[i]=t;
        }
        StringBuilder sb = new StringBuilder();
        initmax(arr,1,1,a);
        initmin(arr,1,1,a);
        for(int i=0;i<b;i++){
            pq.clear();
            pq2.clear();
            st=new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            pickmax(1,1,a,x,y);
            pickmin(1,1,a,x,y);
            sb.append(pq2.poll()).append(" ").append(pq.poll()).append("\n");
        }
        System.out.println(sb);
    }
    private static long initmax(long[] arr, int node, int start, int end){
        if(start==end){
            return tree[node]=arr[start];
        }
        return tree[node] = Math.max(initmax(arr,node*2,start,(start+end)/2),initmax(arr,node*2+1,(start+end)/2+1,end));
    }
    private static long initmin(long[] arr, int node, int start, int end){
        if(start==end){
            return tree2[node]=arr[start];
        }
        return tree2[node] = Math.min(initmin(arr,node*2,start,(start+end)/2),initmin(arr,node*2+1,(start+end)/2+1,end));
    }
    private static long pickmax(int node, int start, int end, int left, int right){
        if(left>end||right<start){
            return 0;
        }
        if(left <= start && end <= right){
            pq.add(tree[node]);
            return tree[node];
        }
        return Math.max(pickmax(node*2, start, (start+end)/2, left, right),pickmax(node*2+1, (start+end)/2+1, end, left, right));
    }
    private static long pickmin(int node, int start, int end, int left, int right){
        if(left>end||right<start){
            return 0;
        }
        if(left <= start && end <= right){
            pq2.add(tree2[node]);
            return tree2[node];
        }
        return Math.min(pickmin(node*2, start, (start+end)/2, left, right),pickmin(node*2+1, (start+end)/2+1, end, left, right));
    }
}
