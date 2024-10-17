import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());

        int b = (int)Math.sqrt(a)+1;
        boolean[] brr = new boolean[a+1];
        for(int i=2;i<=b;i++){
            int c=i;
            int d=2;
            while(c*d<=a){
                brr[c*d]=true;
                d++;
            }
        }
        ArrayList<Integer>ar = new ArrayList<>();
        int res=0;
        int sum=0;
        for(int i=2;i<=a;i++){
            if(!brr[i]){
                res+=i;
                ar.add(i);
                if(res>=a){
                    while(res>a){
                        res-=ar.get(0);
                        ar.remove(0);
                    }
                    if(res==a)
                        sum++;
                }
            }
        }
        System.out.println(sum);
    }
}
