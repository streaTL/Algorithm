import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int res=1;
        int m=0;
        int[] arr = new int[40];
        arr[0]=1;
        arr[1]=2;
        for(int i=2;i<40;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        for(int i=0;i<s.length();i++){
            char c =s.charAt(i);
            if(c=='1'||c=='2'||c=='3'){
                m++;
            }
            else if(c=='0'){
                if(m>2)
                    m-=2;
                else m=0;
                res*=arr[m];
                m=0;
            }
            else if(c=='4'){
                res*=arr[m];
                m=0;
            }
            else{
                if(m>0&&s.charAt(i-1)=='3'){
//                    if(m>2)
//                        m-=2;
//                    else m=0;
                    m-=1;
                }
                res*=arr[m];
                m=0;
            }
        }
        if(m>0)
            res*=arr[m-1];
        System.out.println(res);
    }
}
