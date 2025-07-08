import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        for(int tc=0;tc<t;tc++){
            HashMap<Integer, String> hm = new HashMap<>();
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            hm.put(a,"");
            Queue<Integer> q = new ArrayDeque<>();
            q.add(a);
            while(!q.isEmpty()){
                int x = q.poll();
                if(x==b){
                    System.out.println(hm.get(x));
                    break;
                }
                int x1 = (x*2)%10000;
                int x2 = x-1;
                if(x2==-1)
                    x2=9999;
                int x3 = x*10;
                if(x3>=10000){
                    x3=x3%10000+x3/10000;
                }
                int x4 = (x%10*1000)+x/10;
                if(!hm.containsKey(x1)){
                    hm.put(x1,hm.get(x)+"D");
                    q.add(x1);
                }
                if(!hm.containsKey(x2)){
                    hm.put(x2,hm.get(x)+"S");
                    q.add(x2);
                }
                if(!hm.containsKey(x3)){
                    hm.put(x3,hm.get(x)+"L");
                    q.add(x3);
                }
                if(!hm.containsKey(x4)){
                    hm.put(x4,hm.get(x)+"R");
                    q.add(x4);
                }
            }
        }
    }
}
