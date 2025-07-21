import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static HashMap<String,ArrayList<String>[]> hm;
    static boolean b=false;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st;
        hm = new HashMap<>();
        for(int i=0;i<a-1;i++){
            st = new StringTokenizer(br.readLine());
            String s1 = st.nextToken();
            String s2 = st.nextToken();
            if(!hm.containsKey(s1)){
                hm.put(s1,new ArrayList[2]);
                hm.get(s1)[1]=new ArrayList<>();
                hm.get(s1)[0]=new ArrayList<>();
                hm.get(s1)[1].add(s2);
            }
            else if(hm.containsKey(s1)){
                hm.get(s1)[1].add(s2);
            }
            if(!hm.containsKey(s2)){
                hm.put(s2,new ArrayList[2]);
                hm.get(s2)[0]=new ArrayList<>();
                hm.get(s2)[1]=new ArrayList<>();
                hm.get(s2)[0].add(s1);
            }
            else if(hm.containsKey(s2)){
                hm.get(s2)[0].add(s1);
            }
        }
        st = new StringTokenizer(br.readLine());
        String s1 = st.nextToken();
        String s2 = st.nextToken();
        dfs(s1,s2);
        dfs2(s1,s2);
        if(b)
            System.out.println(1);
        else System.out.println(0);
    }
    private static void dfs(String s1, String s2){
        for(String s : hm.get(s1)[0]){
            if(s.equals(s2)){
                b=true;
                return;
            }
            dfs(s,s2);
        }
    }
    private static void dfs2(String s1, String s2){
        for(String s : hm.get(s1)[1]){
//            System.out.println(s);
            if(s.equals(s2)){
                b=true;
                return;
            }
            dfs2(s,s2);
        }
    }
}
