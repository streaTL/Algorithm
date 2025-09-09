import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] arr = new int[t];
        int[] arr2 = new int[t];
        int res=0;
        for(int i=0;i<t;i++){
            int x = Integer.parseInt(br.readLine());
            arr[i]=x;
            arr2[i]=x;
        }
        Arrays.sort(arr);
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<t;i++){
            hm.put(arr[i],i);
        }
        boolean[] brr = new boolean[t];
        for(int i=0;i<t;i++){
            int x = hm.get(arr2[i]);
            if(!brr[x]){
                brr[x]=true;
                res++;
            }
            if(x-1>=0)
                brr[x-1]=true;
            if(x+1<t)
                brr[x+1]=true;
        }
        System.out.println(res);
    }
}
