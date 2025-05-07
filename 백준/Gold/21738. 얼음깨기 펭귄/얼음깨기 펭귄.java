import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        ArrayList<ArrayList<Integer>> ar = new ArrayList<>();
        for(int i=0;i<=a;i++)
            ar.add(new ArrayList<>());
        for(int i=0;i<a-1;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            ar.get(x).add(y);
            ar.get(y).add(x);
        }
        boolean[] brr = new boolean[a+1];
        Queue<Integer> q = new LinkedList<>();
        q.add(c);
        int g=0;
        int res=0;
        while(!q.isEmpty()){
            int s = q.size();
            for(int i=0;i<s;i++){
                int x = q.poll();
                if(!brr[x]){
                    if(x<=b){
                        if(res!=0){
                            res+=g;
                            System.out.println(a-res-1);
                            return;
                        }
                        res+=g;
                    }
                    for(int j=0;j<ar.get(x).size();j++){
                        if(!brr[ar.get(x).get(j)])
                            q.add(ar.get(x).get(j));
                    }
                    brr[x]=true;
                }

            }
            g++;
        }
    }
}
