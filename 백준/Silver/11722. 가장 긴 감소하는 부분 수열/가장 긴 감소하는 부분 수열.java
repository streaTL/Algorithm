import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] arr = new int[a];
        int[] arr3 = new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        arr3[a-1]=1;
        for(int i=a-2;i>=0;i--){
            for(int j=a-1;j>i;j--){
                if(arr3[j]>arr3[i]&&arr[j]<arr[i])
                    arr3[i]=arr3[j];
            }
            arr3[i]++;
        }
        int res=0;
        for(int i=0;i<a;i++){
            res=Math.max(res,arr3[i]);
        }
        System.out.print(res);
    }
}
