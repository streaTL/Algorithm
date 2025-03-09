import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] arr = new int[a+1];
        int[] arr2 = new int[a+1];
        ArrayList<ArrayList<Integer>> ar = new ArrayList<>();
        for(int i=0;i<=a;i++){
            ar.add(new ArrayList<>());
        }
        for(int i=0;i<b;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            ar.get(x).add(y);
            arr[y]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=a;i++){
            if(arr[i]==0)
                q.add(i);
        }
        int res=0;
        while(!q.isEmpty()){
            res++;
            int x = q.size();
            for(int i=0;i<x;i++){
                int y=q.poll();
                arr2[y]=res;
                for(int j :ar.get(y)){
                    arr[j]-=1;
                    if(arr[j]==0){
                        q.add(j);
                    }
                }
            }
        }
        for(int i=1;i<=a;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
