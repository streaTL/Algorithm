import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String s = br.readLine();
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("0000",1);
        int x1=0;
        int x2=0;
        int x3=0;
        int x4=0;
        int res=0;
        for(int i=0;i<a;i++){
            char c = s.charAt(i);
            if(c=='T')
                x1++;
            else if(c=='G')
                x2++;
            else if(c=='F')
                x3++;
            else if(c=='P')
                x4++;
            String ss = x1%3+""+x2%3+""+x3%3+""+x4%3;
            res+=hm.getOrDefault(ss,0);
            hm.put(ss,hm.getOrDefault(ss,0)+1);
        }
        System.out.println(res);
    }
}
