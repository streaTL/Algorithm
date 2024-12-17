import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[] tree;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[a+1];
        int h = (int)Math.ceil(Math.log(a)/Math.log(2));
        int size = (int)Math.pow(2,h+1);
        tree = new int[size];
        for(int i=1;i<=a;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int b = Integer.parseInt(br.readLine());
        arr[0]=Integer.MAX_VALUE;
        StringBuilder sb = new StringBuilder();
        init(arr,1,1,a);
        for(int i=0;i<b;i++){
            st=new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            if(x==1){
                arr[y]=z;
                update(arr,1,y,1,a);
            }
            else{
                sb.append(pick(arr,1,y,z,1,a)+"\n");
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    private static void init(int[] arr, int node, int start, int end){
        if(start==end)
            tree[node]=start;
        else {
            init(arr,node*2,start,(start+end)/2);
            init(arr,node*2+1,(start+end)/2+1,end);
            if (arr[tree[node*2]] <= arr[tree[node*2+1]]) {
                tree[node] = tree[node*2];
            } else {
                tree[node] = tree[node*2+1];
            }
        }
    }

    private static void update(int[] arr, int node, int idx, int start, int end){
        if(start>idx||end<idx)
            return;
        if(start==end){
            tree[node]= idx;
            return;
        }
        update(arr,node*2,idx,start,(start+end)/2);
        update(arr,node*2+1,idx,(start+end)/2+1,end);
        if (arr[tree[node*2]] <= arr[tree[node*2+1]]) {
            tree[node] = tree[node*2];
        }
        else {
            tree[node] = tree[node*2+1];
        }
    }
    private static int pick(int[] arr,int node, int left, int right, int start, int end){
        if(left<=start&&right>=end)
            return tree[node];
        if(left>end||right<start)
            return 0;
        
        int m1 = pick(arr,node*2,left,right,start,(start+end)/2);
        int m2 = pick(arr,node*2+1,left,right,(start+end)/2+1,end);

        if(m1==0){
            return m2;
        } else if (m2==0) {
            return m1;
        }else {
            if(arr[m1]>arr[m2]){
                return m2;
            }
            else return m1;
        }
    }
}
