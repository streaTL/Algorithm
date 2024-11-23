import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int[] arr = new int[a];
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(Integer.parseInt(br.readLine()));
        for(int i=1;i<a;i++){
            int b = Integer.parseInt(br.readLine());
            if(ar.get(0)>b){
                ar.add(0,b);
                ar.remove(1);
                continue;
            }
            if(b>ar.get(ar.size()-1)){
                ar.add(b);
            }
            else{
                for(int j=ar.size()-2;j>=0;j--){
                    if(j==0&&b<ar.get(0)){
                        ar.add(0,b);
                        ar.remove(1);
                        break;
                    }
                    if(b>ar.get(j)){
                        ar.add(j+1,b);
                        ar.remove(j+2);
                        break;
                    }
                }
            }

        }

        System.out.println(a-ar.size());
    }
}
