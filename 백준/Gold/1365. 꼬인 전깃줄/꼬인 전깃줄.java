import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[a+1];
        for(int i=1;i<=a;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(arr[1]);
        for(int i=2;i<=a;i++){
            if(arr[i]>ar.get(ar.size()-1))
                ar.add(arr[i]);
            else{
                int left=0;
                int right=ar.size();
                while(left<right){
                    int mid = (left+right)/2;
                    if(arr[i]>ar.get(mid)){
                        left=mid+1;
                    }
                    else right=mid;
                }
                ar.remove(left);
                ar.add(left,arr[i]);
            }
        }
        System.out.println(a-ar.size());
    }
}
