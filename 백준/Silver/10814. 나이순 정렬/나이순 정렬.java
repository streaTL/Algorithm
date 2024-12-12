import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        String[][] srr = new String[a][2];
        for(int i=0;i<a;i++){
            st=new StringTokenizer(br.readLine());
            srr[i][0]=st.nextToken();
            srr[i][1]=st.nextToken();
        }
        Arrays.sort(srr,(x, y)-> Integer.parseInt(x[0])-Integer.parseInt(y[0]));
        for(String[] i : srr)
            System.out.println(i[0]+" "+i[1]);
    }
}
