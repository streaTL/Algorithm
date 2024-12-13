import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static long[] tree;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int hi = (int)Math.ceil(Math.log(a)/Math.log(2));
        tree = new long[(int)Math.pow(2,hi+1)];
        int[] arr = new int[a+1];
        for(int i=1;i<=a;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        init(arr,1,1,a);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<b+c;i++){
            st=new StringTokenizer(br.readLine());
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());
            int z=Integer.parseInt(st.nextToken());
            if(x==1){
                update(1,y,1,a,z);
                arr[y]=z;
            }
            else{
                sb.append(pick(1,1,a,y,z)+"\n");
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
    private static long init(int[] arr, int node, int start, int end){
        if(start==end)
            return tree[node]=arr[start];
        return tree[node]=(init(arr,node*2,start,(start+end)/2)*init(arr,node*2+1,(start+end)/2+1,end))%1000000007;
    }
    private static long update(int node, int idx, int start, int end, int after){
        if(idx<start||idx>end){
            return tree[node];
        }
        if(start==end)
            return tree[node]=after;
        return tree[node] = update(node * 2, idx, start, (start + end) / 2, after)*update(node * 2 + 1, idx, (start + end) / 2 + 1, end, after)%1000000007;

    }
    private static long pick(int node,int start, int end, int left, int right){
        if(left>end||right<start)
            return 1;
        if(left<=start&&right>=end)
            return tree[node];
        return pick(node*2,start,(start+end)/2,left,right)*pick(node*2+1,(start+end)/2+1,end,left,right)%1000000007;
    }
}
