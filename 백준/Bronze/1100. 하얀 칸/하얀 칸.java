import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int res=0;
        for(int i=0;i<8;i++){
            String s = br.readLine();
            if(i%2==0){
                for(int j=0;j<8;j+=2){
                    if(s.charAt(j)=='F')
                        res++;
                }
            }
            else {
                for(int j=1;j<8;j+=2){
                    if(s.charAt(j)=='F')
                        res++;
                }
            }
        }
        System.out.println(res);
    }
}
