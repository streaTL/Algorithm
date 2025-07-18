import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        if(a==1||a==2){
            System.out.println(1);
        }
        else if(a==3||a==4||a==5){
            System.out.println(2);
        }
        else System.out.println(3);
    }
}
