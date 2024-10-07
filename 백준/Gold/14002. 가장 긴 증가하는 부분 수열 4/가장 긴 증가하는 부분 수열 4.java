import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] arr = new int[a];
        int[] arr2 = new int[a];
//        ArrayList<Integer> ar = new ArrayList<>();
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr2.length;i++){
            arr2[i]=1;
        }
//        arr2[0]=1;
        for(int i=1;i<a;i++){
//            int t=0;
            for(int j=0;j<i;j++){
                if(arr2[j]>=arr2[i]&&arr[j]<arr[i]){
                    arr2[i]=arr2[j]+1;
                }
            }
//            arr2[i]++;
        }
//        Arrays.sort(arr2);
//        for(int i=0;i<arr2.length;i++){
//            System.out.print(arr2[i]+" ");
//        }

        int res=0;
        for(int i=0;i<arr2.length;i++){
            res=Math.max(res,arr2[i]);
        }
        System.out.println(res);
        int[] ar = new int[res];
        int e=res-1;
        for(int i=arr2.length-1;i>=0;i--){
            if(arr2[i]==res){
                ar[e]=arr[i];
                e--;
                res--;
            }
            if(res==0)
                break;
        }
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
}
