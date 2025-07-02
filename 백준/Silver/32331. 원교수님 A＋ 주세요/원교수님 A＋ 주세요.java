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
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        st.nextToken();
        long res = Long.parseLong(st.nextToken());
        List<Integer> ar = new ArrayList<>();
        for(int i=0;i<a-1;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken().substring(0,4));
            int y = Integer.parseInt(st.nextToken());
            if(x==2024){
                if(d<c-y)
                    ar.add(y);
                else
                    ar.add(y+d-(c-y));
            }
        }
        Collections.sort(ar,(x,y)->y-x);
        if(b-1>=ar.size()){
            System.out.println("YES");
            System.out.println("0");
            return;
        }
        if(ar.get(b-1)<=res){
            System.out.println("YES");
            System.out.println("0");
        }
        else if(ar.get(b-1)<=res+d){
            System.out.println("YES");
            System.out.println(ar.get(b-1)-res);
        }
        else System.out.println("NO");
    }
}
