import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] seg, arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        arr = new int[a+1];
        st = new StringTokenizer(br.readLine());
        for(int i=1;i<=a;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int b = (int)Math.ceil(Math.log(a)/Math.log(2));
        int size = (int)Math.pow(2,b+1);
        seg = new int[size];
        init(1,1,a);
        int c = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<c;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            if(x==1){
                if((arr[y]-z)%2!=0){
                    if(z%2==0)
                        update(1,1,a,y,1);
                    else update(1,1,a,y,-1);
                    arr[y]=z;
                }
            }
            else if(x==2){
                sb.append(pick(1,1,a,y,z)+"\n");
            }
            else{
                int f = z-y+1-pick(1,1,a,y,z);
                sb.append(f+"\n");
            }
        }
        System.out.println(sb);
    }

    public static void init(int n, int start, int end){
        if(start==end){
            if(arr[start]%2==0)
                seg[n]=1;
            else seg[n]=0;
            return;
        }
        init(n*2,start,(start+end)/2);
        init(n*2+1,(start+end)/2+1,end);
        seg[n]=seg[n*2]+seg[n*2+1];
    }
    public static int pick(int n, int start, int end, int left, int right){
        if(start>right||end<left){
            return 0;
        }
        if(start>=left&&end<=right)
            return seg[n];
        return pick(n*2,start,(start+end)/2,left,right)+pick(n*2+1,(start+end)/2+1,end,left,right);
    }
    public static void update(int n, int start, int end, int num, int x){
        if(start>num||end<num)
            return;
        seg[n]+=x;
        if(start==end)
            return;
        update(n*2,start,(start+end)/2,num,x);
        update(n*2+1,(start+end)/2+1,end,num,x);
    }
}
