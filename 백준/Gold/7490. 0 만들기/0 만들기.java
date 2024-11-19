import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static int c=0;
    static ArrayList<String> s;
    static String [] op = {"+", "-", " "};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(br.readLine());
        for(int i=0;i<a;i++){
            s = new ArrayList<>();
            int ss = Integer.parseInt(br.readLine());
            dfs(2,ss,"1");
            Collections.sort(s);
            for(int j=0;j<s.size();j++){
                String q = s.get(j);
                q=q.replaceAll(" ","");
                st=new StringTokenizer(q,"+-",true);
                int w=0;
                w+=Integer.parseInt(st.nextToken());
                while(st.hasMoreElements()){
                    String g = st.nextToken();
                    int f = Integer.parseInt(st.nextToken());
                    if(g.equals("+"))
                        w+=f;
                    else if(g.equals("-"))
                        w-=f;
                }
                if(w==0){
                    sb.append(s.get(j)).append("\n");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    private static void dfs(int a, int b,String x){
        if(a>b){
            s.add(x);
            return;
        }
        dfs(a+1,b,x+"+"+a);
        dfs(a+1,b,x+"-"+a);
        dfs(a+1,b,x+" "+a);
    }

}
