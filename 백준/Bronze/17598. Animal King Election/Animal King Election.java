import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a=0;
        int b=0;
        for(int i=0;i<9;i++){
            char c = br.readLine().charAt(0);
            if(c=='L')
                a++;
            else b++;
        }
        System.out.println(a>b?"Lion":"Tiger");
    }
}
