import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] arr = new int[a];
        int[] arr2 = new int[a];
        int[] arr3 = new int[a];
        arr[0]=sc.nextInt();
        arr3[0]=arr[0];
        for(int i=1;i<a;i++){
            for(int j=0;j<=i;j++){
                arr2[j]=sc.nextInt();
            }
//            arr3[0]=arr[0]+arr2[0];
            for(int j=0;j<i;j++){
                if(arr3[j]<arr[j]+arr2[j])
                    arr3[j]=arr[j]+arr2[j];
                if(arr3[j+1]<arr[j]+arr2[j+1])
                    arr3[j+1]=arr[j]+arr2[j+1];
//                for(int x : arr3){
//                    System.out.print(x+" ");
//                }
//                System.out.println();
            }
            for(int x=0;x<a;x++){
                arr[x]=arr3[x];
            }
//            System.out.println();
//            for(int x : arr){
//                System.out.print(x+" ");
//            }
//            System.out.println();


        }
        Arrays.sort(arr3);
        System.out.print(arr3[a-1]);
    }

}
