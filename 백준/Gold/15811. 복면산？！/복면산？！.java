import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static HashMap<Character,Long> hm1 = new HashMap<>();
    static HashMap<Character,Long> hm3 = new HashMap<>();
    static List<Character> ar = new ArrayList<>();
    static boolean[] ck = new boolean[10];
    static boolean res=false;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s1 = st.nextToken();
        String s2 = st.nextToken();
        String s3 = st.nextToken();
        for(int i=0;i<s1.length();i++){
            char c = s1.charAt(i);
            long x = (long)Math.pow(10,s1.length()-1-i);
            if(hm1.containsKey(c)){
                hm1.replace(c,hm1.get(c)+x);
            }
            else {
                hm1.put(c,x);
                ar.add(c);
            }
        }
        for(int i=0;i<s2.length();i++){
            char c = s2.charAt(i);
            long x = (long)Math.pow(10,s2.length()-1-i);
            if(hm1.containsKey(c)){
                hm1.replace(c,hm1.get(c)+x);
            }
            else {
                hm1.put(c,x);
                ar.add(c);
            }
        }
        for(int i=0;i<s3.length();i++){
            char c = s3.charAt(i);
            long x = (long)Math.pow(10,s3.length()-1-i);
            if(hm3.containsKey(c)){
                hm3.replace(c,hm3.get(c)+x);
            }
            else {
                hm3.put(c,x);
                if(!hm1.containsKey(c))
                    ar.add(c);
            }
        }
        dfs(0,0,0);
        if(res)
            System.out.println("YES");
        else System.out.println("NO");
    }
    static void dfs(int a,long b,long c){
        if(a==ar.size()){
            if(b==c)
                res=true;
            return;
        }
        char cc = ar.get(a);
        for(int j=0;j<10;j++){
            if(!ck[j]){
                long x1=b;
                long x2=c;
                if(hm1.containsKey(cc)){
                    x1+=j*hm1.get(cc);
                }
                if(hm3.containsKey(cc)){
                    x2+=j*hm3.get(cc);
                }
                ck[j]=true;
                dfs(a+1,x1,x2);
                ck[j]=false;
            }
        }

    }
}
