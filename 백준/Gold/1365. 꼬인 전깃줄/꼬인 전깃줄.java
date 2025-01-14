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
//                int x = ar.size();
                int left=0;
                int right=ar.size();
                while(left<right){
                    int mid = (left+right)/2;
                    if(arr[i]>ar.get(mid)){
                        left=mid+1;
                    }
                    else right=mid;
                }
                if(arr[i]>ar.get(right)){
                    ar.remove(right+1);
                    ar.add(right+1,arr[i]);
                }
                else{
                    ar.remove(right);
                    ar.add(right,arr[i]);
                }
//                for(int j=x-2;j>=0;j--){
//                    if(arr[i]>ar.get(j)){
//                        ar.remove(j);
//                        ar.add(j,arr[i]);
//                        break;
//                    }
//                    if(j==0){
//                        ar.remove(0);
//                        ar.add(0,arr[i]);
//                    }
//                }
            }
        }
        System.out.println(a-ar.size());
    }
}
