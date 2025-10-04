import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(br.readLine());
        double b = Double.parseDouble(br.readLine());
        if(a/(b*b)>25){
            System.out.println("Overweight");
        }
        else if(a/(b*b)>=18.5)
            System.out.println("Normal weight");
        else System.out.println("Underweight");
    }
}
