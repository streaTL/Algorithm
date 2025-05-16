import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        HashSet<Integer> hs = new HashSet<>();
        int[] arr = new int[a];
        for(int i=0;i<a;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        int res=0;
        for(int i=0;i<a;i++){
            int count = 0;
            hs.clear();
            for(int j=0;j<c;j++){
                if(hs.contains(arr[(i+j)%a])){
                    continue;
                }
                else{
                    hs.add(arr[(i+j)%a]);
                    count++;
                    if(arr[(i+j)%a]==d)
                        count--;
                }
            }
            count++;
            res=Math.max(res,count);
        }
        System.out.print(res);
    }
}