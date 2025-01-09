import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        for(int m=0;m<a;m++){
            st=new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int sum = 0;
                for (int j = 0; j < c + b; j++) {
                    sum+=j;
                }
                sum*=b+c;
            sb.append(sum+"\n");
        }
        System.out.println(sb);
    }
}
