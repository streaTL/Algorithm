import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        HashMap<String,String> hs = new HashMap<>();

        for(int i=0;i<a;i++){
            hs.put(sc.next(),sc.next());
        }

        for(int i=0;i<b;i++){
            System.out.println(hs.get(sc.next()));
        }

    }
}
