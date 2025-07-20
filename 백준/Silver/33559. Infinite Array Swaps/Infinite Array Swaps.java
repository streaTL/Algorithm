import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        HashMap<Integer, Integer>hm1 = new HashMap<>();
        HashMap<Integer, Integer>hm2 = new HashMap<>();
        Queue<Integer> q1 = new ArrayDeque<>();
        Queue<Integer> q2 = new ArrayDeque<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<a;i++){
            int b = Integer.parseInt(st.nextToken());
            if(hm1.containsKey(b)){
                hm1.replace(b,hm1.get(b)+1);
            }
            else{
                hm1.put(b,1);
                q1.add(b);
            }
        }
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        int res=0;
        for(int i=0;i<a;i++){
            int b = Integer.parseInt(st.nextToken());
            if(hm1.containsKey(b)){
                res++;
                hm1.replace(b,hm1.get(b)-1);
                sb1.append(b).append(" ");
                sb2.append(b).append(" ");
                if(hm1.get(b)==0)
                    hm1.remove(b);
            }
            else{
                q2.add(b);
            }
        }
        while(!q2.isEmpty()){
            sb2.append(q2.poll()).append(" ");
        }
        while(!q1.isEmpty()){
            int b = q1.poll();
            if(hm1.containsKey(b)){
                hm1.replace(b,hm1.get(b)-1);
                sb1.append(b).append(" ");
                if(hm1.get(b)==0)
                    hm1.remove(b);
                else q1.add(b);
            }
        }
        System.out.println(res);
        System.out.println(sb1);
        System.out.println(sb2);
    }
}
