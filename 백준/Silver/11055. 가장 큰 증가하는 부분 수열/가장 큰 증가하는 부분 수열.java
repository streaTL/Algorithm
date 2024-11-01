import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] arr = new int[a];
        int[] arr2 = new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        arr2[0]=arr[0];
        for(int i=1;i<a;i++){
            for(int j=0;j<i;j++){
                if(arr2[j]>arr2[i]&&arr[j]<arr[i])
                    arr2[i]=arr2[j];
            }
            arr2[i]+=arr[i];
        }
        Arrays.sort(arr2);
        System.out.print(arr2[a-1]);
    }
}
