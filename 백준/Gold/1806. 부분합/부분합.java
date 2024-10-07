import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        ArrayList<Integer> ar = new ArrayList<>();
        int x=0;
        int z=1000000;
        for(int i=0;i<a;i++){
            int y = sc.nextInt();
            x+=y;
            ar.add(y);
            if(x>=b){
                while(x>=b){
                    x-=ar.get(0);
                    ar.remove(0);
                }
                if(z>ar.size())
                    z=ar.size()+1;
            }
        }
        if(z==1000000)
            System.out.println("0");
        else
            System.out.println(z);
    }
}
