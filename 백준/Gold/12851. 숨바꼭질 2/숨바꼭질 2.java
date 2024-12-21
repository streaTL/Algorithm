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

        int[] arr = new int[100001];
        int[] arr2 = new int[100001];
        arr[a]=1;
        Queue<Integer> q = new LinkedList<>();
        q.add(a);
        int res=-1;
        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> ar = new ArrayList<>();
        int count=0;
        while(true){
            res++;
            int y=q.size();
            for(int i=0;i<y;i++) {
                int x = q.poll();
                if (x == b) {
                    count = arr[x];
                    break;
                }
                if (x + 1 < 100001 && arr[x + 1] == 0) {
                    arr2[x + 1] += arr[x];
                    ar.add(x + 1);
                }
                if (x - 1 >= 0 && arr[x - 1] == 0) {
                    arr2[x - 1] += arr[x];
                    ar.add(x - 1);
                }
                if (x * 2 < 100001 && arr[x * 2] == 0) {
                    arr2[x * 2] += arr[x];
                    ar.add(x * 2);
                }
            }
            if(count>0)
                break;
            for(int j:ar){
                if(!hs.contains(j)){
                    q.add(j);
                    arr[j]=arr2[j];
                    hs.add(j);
                }
            }
            ar.clear();
            hs.clear();
            Arrays.fill(arr2,0);

        }
        System.out.println(res);
        System.out.println(count);
    }
}
