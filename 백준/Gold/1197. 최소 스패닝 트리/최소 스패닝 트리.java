import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[][] arr = new int[b][3];
        int[] arr2 = new int[a+1];
        for(int i=0;i<b;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
            arr[i][2]=sc.nextInt();
        }
        for(int i=1;i<a+1;i++){
            arr2[i]=i;
        }
        Arrays.sort(arr,(x,y)->x[2]-y[2]);
        long res=0;
        for(int i=0;i<b;i++){
            if(arr2[arr[i][0]]==0){
                int t = arr2[arr[i][0]];
                for(int j=1;j<a+1;j++){
                    if(arr2[j]==t)
                        arr2[j]=arr2[arr[i][1]];
                }
                res+=arr[i][2];
            }
            else if(arr2[arr[i][1]]==0){
                int t = arr2[arr[i][1]];
                for(int j=1;j<a+1;j++){
                    if(arr2[j]==t)
                        arr2[j]=arr2[arr[i][0]];
                }
                res+=arr[i][2];
            }
            else{
                if(arr2[arr[i][1]]!=arr2[arr[i][0]]){
                    int t = arr2[arr[i][1]];
                    for(int j=1;j<a+1;j++){
                        if(arr2[j]==t)
                            arr2[j]=arr2[arr[i][0]];
                    }
                    res+=arr[i][2];
                }
            }
        }
        System.out.println(res);
    }
}
