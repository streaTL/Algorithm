import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());

        int[][]arr = new int[a][2];
        for(int i=0;i<a;i++){
            st=new StringTokenizer(br.readLine());
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
        }
        ArrayList<Integer> ar = new ArrayList<>();
        int res=0;
        for(int i=0;i<a;i++){
            if(ar.isEmpty()&&arr[i][1]==0)
                continue;
            if(ar.isEmpty()){
                ar.add(arr[i][1]);
                continue;
            }
            int x=0;
            while(!ar.isEmpty()){
                x++;
                if(arr[i][1]==0){
                    res+=ar.size();
                    ar.clear();
                    break;
                }
                else if(arr[i][1]>ar.get(ar.size()-1)){
                    ar.add(arr[i][1]);
                    break;
                }
                else if(arr[i][1]<ar.get(ar.size()-1)){
                    res++;
                    ar.remove(ar.size()-1);
                }
                else if(arr[i][1]==ar.get(ar.size()-1)){
                    break;
                }
            }
            if(arr[i][1]!=0&&ar.isEmpty())
                ar.add(arr[i][1]);
        }
        res+=ar.size();
        System.out.println(res);
    }
}
