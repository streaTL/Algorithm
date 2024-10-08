import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] arr = new int[a];
        int z=0;
        arr[0]=sc.nextInt();
        int x=0;
        int y=0;
        for(int i=1;i<a;i++){
            int b = sc.nextInt();
            if(b>arr[z]){
                z++;
                arr[z]=b;
            }
            else if(b<arr[0]){
                arr[0]=b;
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
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                System.out.println(i);
                break;
            }
        }
        if(arr[arr.length-1]!=0)
            System.out.println(arr.length);
    }
}
