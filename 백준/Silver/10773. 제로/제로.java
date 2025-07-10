import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int res=0;
        Stack<Integer> st = new Stack<>();
        for(int tc=0;tc<t;tc++){
            int a = Integer.parseInt(br.readLine());
            if(a!=0)
                st.add(a);
            else st.pop();
        }
        while(!st.isEmpty()){
            res+=st.pop();
        }
        System.out.println(res);
    }
}
