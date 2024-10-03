import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        long[][] arr = new long[a+1][2];

        for(int i=0;i<a;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        arr[a][0]=arr[0][0];
        arr[a][1]=arr[0][1];
        long x=0;
        long y=0;
        for(int i=0;i<a;i++){
            x+=arr[i][0]*arr[i+1][1];
            y+=arr[i][1]*arr[i+1][0];
        }
        long z=x-y;
        if(z<0)
            z*=-1;
        double q = z;
        System.out.printf("%.1f",q/2);
    }
}
