import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char c = s.charAt(0);
        if(c=='n'||c=='N')
            System.out.println("Naver D2");
        else System.out.println("Naver Whale");
    }
}
