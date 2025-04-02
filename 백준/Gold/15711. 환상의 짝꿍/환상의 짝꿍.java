import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());

        boolean[] brr = new boolean[2000001];
        int w=(int)Math.sqrt(2000001);
        for(int i=3;i<=w;i+=2){
            for(int j=i+i;j<=2000000;j+=i){
                brr[j]=true;
            }
        }
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(2);
        for(int i=3;i<2000001;i+=2){
            if(!brr[i])
                ar.add(i);
        }
        for(int t=0;t<a;t++){
            st = new StringTokenizer(br.readLine());
            long x = Long.parseLong(st.nextToken());
            long y = Long.parseLong(st.nextToken());
            long xx = x+y;
            if(xx%2==0){
                if(xx>3){
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
                continue;
            }
            else{
                if(xx==3)
                    System.out.println("NO");
                else{
                    long b = xx-2;
                    int q=0;
                    int c = (int)Math.sqrt(b);
                    for(int i=0;i<ar.size();i++){
                        if(ar.get(i)>c)
                            break;
                        if(b%ar.get(i)==0){
                            q=1;
                            break;
                        }
                    }
                    if(q==1)
                        System.out.println("NO");
                    else System.out.println("YES");
                }
            }

        }

    }
}
