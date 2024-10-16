import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        for(int l=0;l<count;l++){
            int res=0;
            st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            int[] arr = new int[a+1];
            int[] arr2 = new int[a+1];
            int[] arr3 = new int[a+1];
            st=new StringTokenizer(br.readLine());
            for(int i=1;i<=a;i++){
                arr[i]=Integer.parseInt(st.nextToken());
            }
            ArrayList<ArrayList<Integer>> ar = new ArrayList<>();
            for(int i=0;i<=a;i++){
                ar.add(new ArrayList<>());
            }
            for(int i=0;i<b;i++){
                st=new StringTokenizer(br.readLine());
                int x1=Integer.parseInt(st.nextToken());
                int x2=Integer.parseInt(st.nextToken());
                ar.get(x1).add(x2);
                arr2[x2]++;
            }
            st=new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st.nextToken());

            Queue<Integer> q = new LinkedList<>();
            for(int i=1;i<=a;i++){
                if(arr2[i]==0){
                    q.add(i);
                    arr3[i]=arr[i];
                }
            }
            while(!q.isEmpty()){
                for(int i=0;i<ar.get(q.peek()).size();i++){
                    arr3[ar.get(q.peek()).get(i)]=Math.max(arr3[ar.get(q.peek()).get(i)],arr3[q.peek()]+arr[ar.get(q.peek()).get(i)]);
                    arr2[ar.get(q.peek()).get(i)]--;
                    if(arr2[ar.get(q.peek()).get(i)]==0){
                        q.add(ar.get(q.peek()).get(i));
                    }
                }
                q.poll();
            }
            sb.append(arr3[c]).append("\n");
        }

        System.out.println(sb);
    }
}
