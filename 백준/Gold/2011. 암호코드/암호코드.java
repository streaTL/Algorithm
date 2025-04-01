import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        long res=1;
        if(s.charAt(0)=='0'){
            System.out.println(0);
            return;
        }
        long x=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                if(s.charAt(i-1)>'2'||s.charAt(i-1)=='0'){
                    System.out.println(0);
                    return;
                }
                else{
                    x-=2;
                }
            }
            else if(s.charAt(i)=='1'||s.charAt(i)=='2'){
                x++;
                continue;
            }
            else if(i!=0&&s.charAt(i)>'6'&&s.charAt(i-1)=='2'){
                    x-=2;
            }
            if(x<=0){
                x=0;
                continue;
            }
            else if(x==1)
                res*=2;
            else if(x==2)
                res*=3;
            else{
                int a=2;
                int b=3;
                int c=0;
                for(int j=2;j<x;j++){
                    c=a+b;
                    c=c%1000000;
                    a=b%1000000;
                    b=c;
                }
                res*=c%1000000;
                res=res%1000000;
            }
            x=0;
        }
        if(x>0){
            x--;
            if(x==0)
                x=0;
            else if(x==1)
                res*=2;
            else if(x==2)
                res*=3;
            else{
                int a=2;
                int b=3;
                int c=0;
                for(int j=2;j<x;j++){
                    c=a+b;
                    c=c%1000000;
                    a=b%1000000;
                    b=c;
                }
                res*=c%1000000;
                res=res%1000000;
            }
        }
        System.out.println(res%1000000);
    }
}
