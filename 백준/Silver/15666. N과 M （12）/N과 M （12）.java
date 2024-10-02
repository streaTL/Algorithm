import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    static boolean[] brr;
    static int[] br;
    static HashSet<String> hs = new HashSet<>();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int[] arr = new int[x];
        brr = new boolean[x];
        br = new int[y];
        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        dfs(arr,0,0,y);

    }

    static void dfs(int[] arr, int a,int b, int c){
        if(a==c){
            String s="";
            for(int i=0;i<c;i++){
                s+=br[i]+" ";
            }
            if(!hs.contains(s)){
                hs.add(s);
                for(int i=0;i<c;i++){
                    System.out.print(br[i]+" ");
                }
                System.out.println();
            }
            return;
        }
        for(int i=b;i<arr.length;i++){
//            if(!brr[i]){
                brr[i]=true;
                br[a]=arr[i];
                dfs(arr,a+1,i,c);
                brr[i]=false;
//            }
        }
    }

}
