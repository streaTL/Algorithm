import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        ArrayList<Integer> ar = new ArrayList<>();
        boolean[] brr = new boolean[100001];
        long res=0;
        for(int i=0;i<a;i++){
            int x = Integer.parseInt(st.nextToken());
            if(!brr[x]){
                brr[x]=true;
                ar.add(x);
            }
            else{
                int b = ar.size();
                for(int j=1;j<=b;j++){
                    if(ar.get(0)==x){
                        ar.remove(0);
                        ar.add(x);
                        res+=ar.size();
                        break;
                    }
                    else{
                        brr[ar.get(0)]=false;
                        res+=ar.size();
                        ar.remove(0);
                    }
                }
            }
        }
        for(int i=1;i<=ar.size();i++)
            res+=i;
        System.out.println(res);
    }
}
