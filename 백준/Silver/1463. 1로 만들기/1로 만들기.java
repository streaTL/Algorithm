import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());

        boolean[] arr = new boolean[a+1];

        Queue<Integer> q = new LinkedList<>();
        q.add(a);
        int res=0;
        int e=0;
        while(!q.isEmpty()){
            int x=q.size();
            res++;
            for(int i=0;i<x;i++){
                int t = q.poll();
                if(t==1){
                    e=-1;
                    break;
                }
                if(!arr[t]&&t>=1){
                    arr[t]=true;
                    if(t%3==0&&!arr[t/3]){
                        q.add(t/3);
                    }
                    if(t%2==0&&!arr[t/2]){
                        q.add(t/2);
                    }
                    if(!arr[t-1])
                        q.add(t-1);
                }
            }
            if(e==-1)
                break;
        }
        System.out.println(res-1);
    }
}
