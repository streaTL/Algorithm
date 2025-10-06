import java.io.*;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean b=false;
        for(int t=1;t<=5;t++){
            String s = br.readLine();
            if(s.contains("FBI")){
                b=true;
                System.out.print(t+" ");
            }
        }
        if(b==false)
            System.out.println("HE GOT AWAY!");
    }
}
