import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String s = br.readLine();
            if(s.equals("0"))
                break;
            int x=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                    System.out.println("no");
                    x=1;
                    break;
                }
            }
            if(x==0)
                System.out.println("yes");
        }

    }
}
