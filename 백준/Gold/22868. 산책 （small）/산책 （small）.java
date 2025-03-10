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
            ar.get(x).add(y);
            ar.get(y).add(x);
        }
        st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        for(int i=1;i<=a;i++){
            Collections.sort(ar.get(i));
        }
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        int[] arr1 = new int[a+1];
        int[] arr2 = new int[a+1];
        arr1[s]=s;
        int res=0;
        while(!q.isEmpty()){
            int v = q.size();
            res++;
            while(v-->0){
                int x = q.poll();
                for(int i=0;i<ar.get(x).size();i++){
                    int c = ar.get(x).get(i);
                    if(c==e){
                        arr1[c]=x;
                        q.clear();
                        v=0;
                        int g=e;
                        while(true){
                            arr2[arr1[g]]=-1;
                            g=arr1[g];
                            if(arr1[g]==s)
                                break;
                        }
                        break;
                    }
                    if(arr1[c]==0){
                        arr1[c]=x;
                        q.add(c);
                    }
                }
            }
        }
        q.add(e);
        while(!q.isEmpty()){
            int v = q.size();
            res++;
            while(v-->0){
                int x = q.poll();
                for(int i=0;i<ar.get(x).size();i++){
                    int c = ar.get(x).get(i);
                    if(c==s){
                        q.clear();
                        v=0;
                        break;
                    }
                    if(arr2[c]==0){
                        arr2[c]=x;
                        q.add(c);
                    }
                }
            }
        }
        System.out.println(res);
    }
}
