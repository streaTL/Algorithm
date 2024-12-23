import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int res=0;
        for(int i=0;i<b;i++){
            int x=0;
            if(s.charAt(i)=='I'){
                for(int j=i+1;j<b-1;j+=2){
                    if(s.charAt(j)=='O'&&s.charAt(j+1)=='I'){
                        x++;
                    }
                    else{
                        i=j-1;
                        break;
                    }
                    i=j;
                }
                if(x-a>=0)
                    res+=x-a+1;
            }
        }
        System.out.println(res);
    }
}
