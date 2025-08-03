import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        for(int t=0;t<a;t++){
            String s = br.readLine();
            StringBuilder sb = new StringBuilder();
            char c =  s.charAt(0);
            sb.append(c);
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!=c){
                    c=s.charAt(i);
                    sb.append(c);
                }
            }
            System.out.println(sb);
        }
    }

}
