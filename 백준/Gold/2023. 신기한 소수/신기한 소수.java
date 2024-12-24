import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[]{1,3,7,9};
        Queue<Integer> q = new LinkedList<>();
        q.add(2);
        q.add(3);
        q.add(5);
        q.add(7);
        int b=1;
        while(b<a){
            int x=q.size();
            for(int i=0;i<x;i++){
                int y=q.poll();
                for(int j=0;j<4;j++){
                    int z=y*10+arr[j];
                    int c = (int)Math.sqrt(z);
                    boolean tf=false;
                    for(int k=2;k<=c;k++){
                        if(z%k==0){
                            tf=true;
                            break;
                        }
                    }
                    if(!tf)
                        q.add(z);
                }
            }
            b++;
        }
        int u=q.size();
        for(int i=0;i<u;i++){
            sb.append(q.poll()+"\n");
        }
        System.out.println(sb);
    }
}
