import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<a;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int res = y-x;
            int c = 0;
            int sum=0;
            while(true){
                if(res-(c+1)*2>0){
                    res-=(c+1)*2;
                    c++;
                    sum+=2;
                }
                else {
                    if(res>c+1)
                        sum+=2;
                    else sum+=1;
                    break;
                }
            }
            sb.append(sum+"\n");
        }
        System.out.println(sb);
    }
}
