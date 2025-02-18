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
        int b = Integer.parseInt(st.nextToken());
        int c = (int)Math.ceil(Math.log(a)/Math.log(2));
        int size = (int)Math.pow(2,c+1);
        seg = new int[size];
        arr = new int[a+1];
        for(int i=1;i<=a;i++)
            arr[i]=Integer.parseInt(br.readLine());
        init(1,1,a);
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<b;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            sb.append(pick(1,x,y,1,a)+"\n");
        }
        System.out.println(sb);
    }
    private static int init(int a,int start, int end){
        if(start==end)
            return seg[a]=arr[start];
        return seg[a] = Math.min(init(a*2,start,(start+end)/2),init(a*2+1,(start+end)/2+1,end));
    }

    private static int pick(int n ,int left, int right, int start, int end){
        if(end<left||start>right){
            return Integer.MAX_VALUE;
        }
        if(left<=start&&right>=end){
            return seg[n];
        }
        return Math.min(pick(n*2,left,right,start,(start+end)/2),pick(n*2+1,left,right,(start+end)/2+1,end));
    }
}
