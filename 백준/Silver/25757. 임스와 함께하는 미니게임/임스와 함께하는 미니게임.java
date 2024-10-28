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
        String s = st.nextToken();
        HashSet<String> hs = new HashSet<>();
        for(int i=0;i<a;i++){
            st=new StringTokenizer(br.readLine());
            hs.add(st.nextToken());
        }
        if(s.charAt(0)=='Y')
            System.out.println(hs.size());
        else if(s.charAt(0)=='F')
            System.out.println(hs.size()/2);
        else if(s.charAt(0)=='O')
            System.out.println(hs.size()/3);
    }
}
