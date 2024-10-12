import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static boolean[] vs;
    static int[] brr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[][] arr = new int[a-1][2];
        brr = new int[a+1];
        for(int i=0;i<a-1;i++){
            st=new StringTokenizer(br.readLine());
            arr[i][0]=Integer.parseInt(st.nextToken());
            arr[i][1]=Integer.parseInt(st.nextToken());
        }
        ArrayList<ArrayList<Integer>> ar = new ArrayList<>();
        for(int i=0;i<a+1;i++){
            ar.add(new ArrayList<>());
        }
        for(int i=0;i<a-1;i++){
            ar.get(arr[i][0]).add(arr[i][1]);
            ar.get(arr[i][1]).add(arr[i][0]);
        }

        StringBuilder sb = new StringBuilder();

        vs = new boolean[a+1];
        dfs(b,ar);

        for(int i=0;i<c;i++){
            st=new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            sb.append(brr[w]+"\n");
        }

        System.out.println(sb);

    }

    static int dfs(int a,ArrayList<ArrayList<Integer>>ar){
        vs[a]=true;
        int size=1;

        for (int i : ar.get(a)) {
            if (!vs[i]) {
                size += dfs(i,ar);
            }
        }
        brr[a]=size;
        return size;
    }

}
