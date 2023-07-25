import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        int[] arr = new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        while(b!=0){
            if(b%arr[a-1]==0){
                c+=b/arr[a-1];
                break;
            }
            else{
                c+=b/arr[a-1];
                b=b%arr[a-1];
            }
            a-=1;
        }
        System.out.println(c);
    }

}
