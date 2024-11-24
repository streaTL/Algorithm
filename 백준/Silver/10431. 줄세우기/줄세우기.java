import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        for(int t=0;t<a;t++){
            ArrayList<Integer> ar = new ArrayList<>();
            st=new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st.nextToken());
            ar.add(Integer.parseInt(st.nextToken()));
            int res=0;
            for(int i=1;i<20;i++){
                int x = Integer.parseInt(st.nextToken());
                for(int j=0;j<ar.size();j++){
                    if(ar.get(j)>x){
                        ar.add(j,x);
                        res+=ar.size()-j-1;
                        break;
                    }
                }
                if(x>ar.get(ar.size()-1))
                    ar.add(x);
            }
            System.out.println(c+" "+res);
        }
    }
}
