import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for(int i=0;i<3;i++){
            st = new StringTokenizer(br.readLine());
            int a1 = Integer.parseInt(st.nextToken());
            int b1 = Integer.parseInt(st.nextToken());
            int c1 = Integer.parseInt(st.nextToken());
            int a2 = Integer.parseInt(st.nextToken());
            int b2 = Integer.parseInt(st.nextToken());
            int c2 = Integer.parseInt(st.nextToken());
            int x=0,y=0,z=0;
            x = a2-a1;
            y=b2-b1;
            z=c2-c1;
            if(z<0){
                y--;
                z=60+z;
            }
            if(y<0){
                x--;
                y=60+y;
            }
            System.out.println(x+" "+y+" "+z);
        }

    }
}
