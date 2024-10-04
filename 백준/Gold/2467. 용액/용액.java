import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int[] arr = new int[a];

        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int l=0;
        int r=a-1;
        int x=Math.abs(arr[l]+arr[r]);
        int y;
        int sl=l;
        int sr=r;
        while(true){
            if(arr[l]+arr[r]>0&&r-1!=l){
                r--;
                if(x>=Math.abs(arr[l]+arr[r])){
                    x=Math.abs(arr[l]+arr[r]);
                    sl=l;
                    sr=r;
                }
            }
            else if(arr[l]+arr[r]<0&&r-1!=l){
                l++;
                if(x>=Math.abs(arr[l]+arr[r])){
                    x=Math.abs(arr[l]+arr[r]);
                    sl=l;
                    sr=r;
                }
            }
            else if(arr[l]+arr[r]==0)
                break;
            if(r-1==l){
                break;
            }
        }
        System.out.print(arr[sl]+" "+arr[sr]);


    }
}
