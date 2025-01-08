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
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        String[] srr = new String[b];
        for(int i=0;i<b;i++){
            srr[i]=br.readLine();
        }
        char[] crr = new char[a];
        Arrays.fill(crr,'?');
        for(int i=0;i<b;i++){
            for(int j=0;j<a;j++){
                for(int k=0;k<c;k++){
                    if(srr[i].charAt(j*c+k)!='?')
                        crr[j]=srr[i].charAt(j*c+k);
                }
            }
        }
        for(char i : crr)
            System.out.print(i);
    }
}
