import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[a+1];
        int[][] arr2 = new int[a+1][2];
        for(int i=1;i<=a;i++){
            arr[i]= Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        Stack<int[]> s = new Stack<>();
        for(int i=1;i<=a;i++){
            while(!s.isEmpty()&&s.peek()[0]<=arr[i]){
                s.pop();
            }
            arr2[i][0]=s.size();
            if(!s.isEmpty())
                arr2[i][1]=s.peek()[1];
            s.add(new int[]{arr[i],i});
        }
        s.clear();
        for(int i=a;i>0;i--){
            while(!s.isEmpty()&&s.peek()[0]<=arr[i]){
                s.pop();
            }
            arr2[i][0]+=s.size();
            if(!s.isEmpty()){
                if(arr2[i][1]==0)
                    arr2[i][1]=s.peek()[1];
                else if(i-arr2[i][1]>s.peek()[1]-i)
                    arr2[i][1]=s.peek()[1];
            }
            s.add(new int[]{arr[i],i});
        }
        for(int i=1;i<=a;i++){
            if(arr2[i][0]==0)
                sb.append(0).append("\n");
            else sb.append(arr2[i][0]).append(" ").append(arr2[i][1]).append("\n");
        }
        System.out.println(sb);
    }
}
