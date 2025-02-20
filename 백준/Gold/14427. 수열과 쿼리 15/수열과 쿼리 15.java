import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] seg;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int c = (int)Math.ceil(Math.log(a)/Math.log(2));
        int size = (int)Math.pow(2,c+1);
        seg = new int[size];
        arr = new int[a+1];
        arr[0]=Integer.MAX_VALUE;
        st = new StringTokenizer(br.readLine());
        for(int i=1;i<=a;i++)
            arr[i]=Integer.parseInt(st.nextToken());
        init(1,1,a);
        StringBuilder sb = new StringBuilder();
        int b = Integer.parseInt(br.readLine());
        for (int i=0;i<b;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            if(x==1){
                int y = Integer.parseInt(st.nextToken());
                int z = Integer.parseInt(st.nextToken());
                arr[y]=z;
                update(1,1,a,y);
            }
            else{
                sb.append(seg[1]+"\n");
            }
        }
        System.out.println(sb);
    }
    private static void init(int a,int start, int end){
        if(start==end){
            seg[a]=start;
            return;
        }
        init(a*2,start,(start+end)/2);
        init(a*2+1,(start+end)/2+1,end);
        if(arr[seg[a*2]]>arr[seg[a*2+1]]){
            seg[a]=seg[a*2+1];
        }
        else seg[a]=seg[a*2];
    }
    private static void update(int n,int start,int end,int num){
        if(start>num||end<num)
            return;
        if(start==end)
            return;
        update(n*2,start,(start+end)/2,num);
        update(n*2+1,(start+end)/2+1,end,num);
        if(arr[seg[n*2]]>arr[seg[n*2+1]]){
            seg[n]=seg[n*2+1];
        }
        else seg[n]=seg[n*2];
    }
}
