import java.util.*;

public class Main {

    static int[] arr;

    static int[] arr2;
    static boolean[] arr3;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        arr = new int[b];
        arr2 = new int[a];
        arr3 = new boolean[a];
        for(int i=0;i<a;i++){
            arr2[i]=sc.nextInt();

        }
        Arrays.sort(arr2);
        dfs(a,b,0);
    }

    static private void dfs(int x, int y, int z){

        if(z==y){
            for(int i=0;i<y;i++){
                System.out.print(arr[i]+" ");
            }
//            System.out.print(arr[y-1]);
            System.out.println();
            return;
        }

        for(int i=0;i<x;i++){
            if(!arr3[i]) {
                arr[z] = arr2[i];
                arr3[i] = true;
                dfs(x,y,z+1);
                arr3[i]=false;
            }

        }


    }

}
