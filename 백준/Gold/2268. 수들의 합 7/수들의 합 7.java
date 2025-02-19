import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static long[] seg;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int c = (int)Math.ceil(Math.log(n)/Math.log(2));
        int size = (int)Math.pow(2,c+1);
        seg = new long[size];
        arr = new int[n+1];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
//            System.out.println("x= "+x);
            if(x==0){
                if(y>z){
                    sb.append(pick(1,1,n,z,y)+"\n");
                }
                else sb.append(pick(1,1,n,y,z)+"\n");
            }
            else {
                modify(1, y,z-arr[y],1,n);
                arr[y]=z;
            }
        }
        System.out.println(sb);
    }
    private static void modify(int n,int a,int sum,int start, int end){
        if(start>a||end<a){
            return;
        }
        if(start<=a&&end>=a){
            seg[n]+=sum;
        }
        if(start==end)
            return;
        modify(n*2,a,sum,start,(start+end)/2);
        modify(n*2+1,a,sum,(start+end)/2+1,end);
    }
    private static long pick(int n, int start, int end, int left, int right){
        if(start>right||end<left){
            return 0;
        }
        if(start>=left&&end<=right){
            return seg[n];
        }
        return pick(n*2,start,(start+end)/2,left,right)+pick(n*2+1,(start+end)/2+1,end,left,right);
    }
}
