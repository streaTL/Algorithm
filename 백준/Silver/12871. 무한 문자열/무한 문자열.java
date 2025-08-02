import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();
        String s3 = new String("");
        String s4 = new String("");
        while(s3.length()<=2500){
            if(s3.length()<s4.length()){
                s3+=s1;
            }
            else s4+=s2;
            if(s3.equals(s4)){
                System.out.println(1);
                return;
            }
        }
        System.out.println(0);
    }

}
