import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        if(a==3)
            System.out.println("Hobanwoo");
        else System.out.println("Sangho");
    }

}
