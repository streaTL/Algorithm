import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        if(a==1){
            System.out.println(4);
            return;
        }
        if(a==2){
            System.out.println(7);
            return;
        }
        int x=2;
        int z=1;
        while(true){
            a-=x;
            z++;
            x*=2;
            if(a<=x) {
                break;
            }
        }
        String s = Integer.toBinaryString(a - 1);
        while (s.length() < z) {
            s = "0" + s;
        }
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(c == '0' ? '4' : '7');
        }
        System.out.println(sb);
    }
}
