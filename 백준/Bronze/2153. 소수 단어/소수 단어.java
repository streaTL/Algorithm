import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int x = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>'Z')
                x+=c-'a'+1;
            else x+=c-'A'+27;
        }
        int res=0;
        for(int i=2;i<=x/2;i++){
            if(x%i==0)
                res++;
        }
        if(res==0)
            System.out.println("It is a prime word.");
        else System.out.println("It is not a prime word.");
    }
}
