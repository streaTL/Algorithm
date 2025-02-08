import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long a = Long.parseLong(br.readLine());
        long res=1;
        while(a>0){
            res*=a;
            a--;
        }
        System.out.println(res);
    }
}
