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
        ArrayList<ArrayList<Integer>> ar = new ArrayList<>();
        for(int i=0;i<=a;i++){
            ar.add(new ArrayList<>());
        }
        for(int i=0;i<b;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            ar.get(x).add(y);
            ar.get(x).add(z);
            ar.get(y).add(x);
            ar.get(y).add(z);
        }

        int[][] arr = new int[a+1][a+1];
        for(int[] i : arr)
            Arrays.fill(i,100000000);
        for(int i=1;i<=a;i++){
            arr[i][i]=0;
        }
        int[][] arr2 = new int[a+1][a+1];

        for(int i=1;i<=a;i++){
            Queue<Integer> q1 = new LinkedList<>();
            for(int j=0;j<ar.get(i).size();j+=2){
                q1.add(ar.get(i).get(j));
                arr[i][ar.get(i).get(j)]=ar.get(i).get(j+1);
                arr2[i][ar.get(i).get(j)]=ar.get(i).get(j);
            }
            while(!q1.isEmpty()){
                int x = q1.poll();
                for(int j=0;j<ar.get(x).size();j+=2){
                    if(arr[i][x]+ar.get(x).get(j+1)<arr[i][ar.get(x).get(j)]){
                        arr[i][ar.get(x).get(j)]=arr[i][x]+ar.get(x).get(j+1);
                        arr2[i][ar.get(x).get(j)]=arr2[i][x];
                        q1.add(ar.get(x).get(j));
                    }
                }
            }
        }
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
                if(arr2[i][j]==0)
                    System.out.print("- ");
                else System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }

    }
}
