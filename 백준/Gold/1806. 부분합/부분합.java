import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        ArrayList<Integer> ar = new ArrayList<>();
        int x=0;
        int z=1000000;
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<a;i++){
            int y = Integer.parseInt(st.nextToken());
            x+=y;
            ar.add(y);
            if(x>=b){
                while(x>=b){
                    x-=ar.get(0);
                    ar.remove(0);
                }
                if(z>ar.size())
                    z=ar.size()+1;
            }
        }
        if(z==1000000)
            System.out.println("0");
        else
            System.out.println(z);
    }
}
