import java.util.Scanner;

public class Main {
    static int res;
    static int[] sr = new int[3];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        sr[0]=1;
        sr[1]=2;
        sr[2]=3;
        for(int i=0;i<a;i++){
            res=0;
            int b =sc.nextInt();
            dfs(0,b);
            System.out.println(res);
        }

    }

    static void dfs(int a,int b){
        if(a==b){
            res++;
            return;
        } else if (a>b) {
            return;
        }

        for(int i=0;i<3;i++){
            dfs(a+sr[i],b);
        }

    }

}
