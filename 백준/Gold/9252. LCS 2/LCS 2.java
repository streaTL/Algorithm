import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int[][] arr = new int[a.length()][b.length()];

        int x=-1;
        for(int i=0;i<b.length();i++){
            if(a.charAt(0)==b.charAt(i)){
                x=i;
                break;
            }
        }
        if(x>-1){
            for(int i=x;i<b.length();i++){
                arr[0][i]=1;
            }
        }
        x=-1;
        for(int i=0;i<a.length();i++){
            if(b.charAt(0)==a.charAt(i)){
                x=i;
                break;
            }
        }
        if(x>-1){
            for(int i=x;i<a.length();i++){
                arr[i][0]=1;
            }
        }
        for(int i=1;i<a.length();i++){
            for(int j=1;j<b.length();j++){
                if(a.charAt(i)==b.charAt(j)){
                    arr[i][j]=arr[i-1][j-1]+1;
                }
                else
                    arr[i][j]=Math.max(arr[i-1][j],arr[i][j-1]);
            }
        }
        String c="";
//        for(int i=a.length()-1;i>=1;i--){
//            if(arr[i][b.length()-1]!=arr[i-1][b.length()-1]){
//                c+=a.charAt(i);
//            }
//        }
//        if(arr[0][b.length()-1]==1)
//            c+=a.charAt(0);
//        System.out.println(arr[a.length()-1][b.length()-1]);

        int w = arr[a.length()-1][b.length()-1];
        System.out.println(w);
        int aa=a.length()-1;
        int bb=b.length()-1;
        while(w!=0){
            if(a.charAt(aa)==b.charAt(bb)){
                c+=a.charAt(aa);
                aa--;
                bb--;
                w--;
            }
            else{
                if(aa==0)
                    bb--;
                else if(bb==0)
                    aa--;
                else if(arr[aa][bb-1]>arr[aa-1][bb])
                    bb--;
                else aa--;
            }
        }
        for(int i=c.length()-1;i>=0;i--){
            System.out.print(c.charAt(i));
        }
//        for(int i=0;i<a.length();i++){
//            for(int j=0;j<b.length();j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }


//        int x=0;
//        String res = "";
//        for(int i=0;i<b.length();i++){
//            int y=i;
//            int sum=0;
//            String su = "";
//            for(int j=0;j<a.length();j++){
//                if(b.charAt(y)==a.charAt(j)){
//                    sum++;
//                    su+=b.charAt(y);
//                    y++;
//                }
//                if(y==b.length())
//                    break;
//            }
//            if(sum>x){
//                x=sum;
//                res=su;
//            }
//        }
//        System.out.print(x+"\n"+res);
    }
}
