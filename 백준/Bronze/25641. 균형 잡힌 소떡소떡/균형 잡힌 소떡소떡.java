import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String ss = br.readLine();
        int s=0;
        int t=0;
        Queue<Character> q = new LinkedList<>();
        for(int i=0;i<a;i++){
            q.add(ss.charAt(i));
            if(ss.charAt(i)=='s'){
                s++;
            }
            else t++;
        }

        while(!q.isEmpty()){

            if(s==t)
                break;
            char c = q.poll();
            if(c=='s'){
                s--;
            }
            else t--;
        }
        while(!q.isEmpty()){
            System.out.print(q.poll());
        }
    }
}
