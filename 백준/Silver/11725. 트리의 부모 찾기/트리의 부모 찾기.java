import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int x=0;
        int y=0;
        ArrayList<ArrayList<Integer>> all = new ArrayList<>();
        for(int i=0;i<=a;i++){
            all.add(new ArrayList<Integer>());
        }
        for(int i=1;i<a;i++){
            x=sc.nextInt();
            y=sc.nextInt();
            all.get(x).add(y);
            all.get(y).add(x);
        }
        int[] arr2 = new int[a+1];
        arr2[1]=-1;
        Queue<Integer> q = new LinkedList<>();
        q.add(1);

        while(!q.isEmpty()){
            for(int i=0;i<all.get(q.peek()).size();i++){
                if(arr2[all.get(q.peek()).get(i)]==0){
                    arr2[all.get(q.peek()).get(i)]=q.peek();
                    q.add(all.get(q.peek()).get(i));
                }
            }
            q.poll();
        }
        for(int i=2;i<=a;i++){
            System.out.println(arr2[i]);
        }
    }
}
