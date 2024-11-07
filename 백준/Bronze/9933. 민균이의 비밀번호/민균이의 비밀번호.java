import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        HashSet<String> hs = new HashSet<>();
        for(int i=0;i<a;i++){
            String s = br.readLine();
            String s2 = "";
            for(int j=s.length()-1;j>=0;j--){
                s2+=s.charAt(j);
            }
            if(s.equals(s2)){
                System.out.println(s.length()+" "+s.charAt(s.length()/2));
            }
            else{
                if(hs.contains(s)){
                    System.out.println(s.length()+" "+s.charAt(s.length()/2));
                }
                else{
                    hs.add(s2);
                }
            }
        }
    }
}
