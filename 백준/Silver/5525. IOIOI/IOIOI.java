import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String s1="";
        int c=2*a+1;
        int res=0;
        for(int i=0;i<b;i++){
            s1+=s.charAt(i);
            if(s1.length()==1&&s1.charAt(0)=='O')
                s1="";
            else if(s1.length()==1&&s1.charAt(0)=='I')
                s1="I";
            else if(s1.charAt(s1.length()-2)==s1.charAt(s1.length()-1)){
                if(s1.charAt(s1.length()-1)=='O')
                    s1="";
                else s1="I";
            }
            else{
                if(s1.charAt(s1.length()-1)=='I'&&s1.length()==c){
                    s1=s1.substring(2);
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}
