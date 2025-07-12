import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] arr = new int[b];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<b;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        Deque<Integer>dq = new ArrayDeque<>();
        int res=0;
        int sum=0;
        for(int i=1;i<=a;i++){
            dq.add(i);
        }
        for(int i=0;i<b;i++){
            res=0;
            while(true){
                if(dq.peekFirst()==arr[i]){
                    dq.pollFirst();
                    break;
                }
                dq.add(dq.pollFirst());
                res++;
            }
            if(res>dq.size()/2){
                sum+=dq.size()-res+1;
            }
            else sum+=res;
        }
        System.out.println(sum);
    }
}
