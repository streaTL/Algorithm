import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String s = br.readLine();
            int res = 0;
            if(s.equals("#"))
                break;
            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
                if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U'){
                    res++;
                }
            }
            System.out.println(res);
        }

    }

}
