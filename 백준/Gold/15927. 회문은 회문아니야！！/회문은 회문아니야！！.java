import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char c = s.charAt(0);
        boolean b = true;
        if(s.length()==1){
            System.out.println(-1);
            return;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=c||s.charAt(s.length()-i-1)!=c){
                b=false;
            }
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                System.out.println(s.length());
                return;
            }
        }
        if(b)
            System.out.println(-1);
        else System.out.println(s.length()-1);
    }
}
