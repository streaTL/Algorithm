import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int a,b;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        int low = 0;
        int high = b;
        while(low+1 < high) {
            int mid = (low + high) / 2;
            if(check(mid)) {
                low = mid;
            }else {
                high = mid;
            }
        }
        System.out.println(high);
    }
    static public boolean check(int mid) {
        int c = 0;
        for(int i=1;i<=a;i++){
            c += Math.min(a, mid / i);
        }
        return c < b;
    }
}