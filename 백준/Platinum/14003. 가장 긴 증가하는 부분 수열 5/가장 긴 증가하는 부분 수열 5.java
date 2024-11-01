import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int[] arr = new int[a];
        int z=0;
        Arrays.fill(arr, -1000000002);
        st=new StringTokenizer(br.readLine());
        int[] save = new int[a];
        for(int i=0;i<a;i++){
            save[i]=Integer.parseInt(st.nextToken());
        }
        arr[0]=save[0];
        int x=0;
        int y=0;
        ArrayList<ArrayList<Integer>> ar = new ArrayList<>();
        ar.add(new ArrayList<>());
        ar.get(0).add(0);
        for(int i=1;i<a;i++){
            int b = save[i];
            if(b>arr[z]){
                z++;
                arr[z]=b;
                ar.add(new ArrayList<>());
                ar.get(ar.size()-1).add(i);
            }
            else if(b<arr[0]){
                arr[0]=b;
                ar.get(0).add(i);
            }
            else{
                x = 0;
                y = z;
                while(x<y){
                    int mid = (x+y)/2;
                    if(arr[mid]==b){
                        x=mid;
                        break;
                    }
                    else if(arr[mid]<b)
                        x=mid+1;
                    else{
                        y=mid;
                    }
                }
                arr[x]=b;
                ar.get(x).add(i);
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==-1000000002){
                System.out.println(i);
                break;
            }
        }
        if(arr[arr.length-1]!=-1000000002)
            System.out.println(arr.length);
        int res=Integer.MAX_VALUE;
        ArrayList<Integer> ar2 = new ArrayList<>();
        for(int i=ar.size()-1;i>=0;i--){
            for(int j=ar.get(i).size()-1;j>=0;j--){
                if(ar.get(i).get(j)<res){
                    ar2.add(save[ar.get(i).get(j)]);
                    res=ar.get(i).get(j);
                    break;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=ar2.size()-1;i>=0;i--){
            sb.append(ar2.get(i)).append(" ");
        }
        System.out.println(sb);
    }
}
