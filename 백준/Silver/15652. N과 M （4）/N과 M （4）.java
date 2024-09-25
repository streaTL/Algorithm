import java.util.*;

public class Main {

    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        arr = new int[b];
        dfs(a,b,0,1);
    }

    static private void dfs(int x, int y, int z, int q){

        if(z==y){
            for(int i=0;i<y-1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.print(arr[y-1]);
            System.out.println();
            return;
        }

        for(int i=q;i<=x;i++){
            arr[z]=i;
            dfs(x,y,z+1,i);
        }


    }

}
