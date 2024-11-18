import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static boolean[]v;
    static boolean[]v2;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int[] arr = new int[a+1];
        v=new boolean[a+1];
        v2=new boolean[a+1];
        for(int i=1;i<=a;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        ArrayList<Integer>ar = new ArrayList<>();
        dfs(arr,1,a);
        for(int i=1;i<=a;i++){
            if(v2[i])
                ar.add(i);
        }
        System.out.println(ar.size());
        for(int i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }
    }

    private static void dfs(int[] arr,int a,int b){
        if(a>b){
            return;
        }
        if(v[a]){
            dfs(arr,a+1,b);
            return;
        }
        int x=a;
        while(true){
            if(arr[x]==a){
                v[a]=true;
                for(int i=1;i<=b;i++){
                    if(v[i])
                        v2[i]=v[i];
                }
                for(int i=1;i<=b;i++){
                    v[i]=v2[i];
                }
                break;
            }
            else{
                if(v[arr[x]]){
                    for(int i=1;i<=b;i++){
                        v[i]=v2[i];
                    }
                    break;
                }
                else{
                    v[arr[x]]=true;
                    x=arr[x];
                }
            }
        }
        dfs(arr,a+1,b);
    }

}
