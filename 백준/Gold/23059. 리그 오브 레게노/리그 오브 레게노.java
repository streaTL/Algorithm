import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st;
        HashMap<String, ArrayList<String>> hm1 = new HashMap<>();
        HashMap<String,Integer> hm2 = new HashMap<>();
        HashSet<String> hs = new HashSet<>();
        ArrayList<String> ar = new ArrayList<>();
        PriorityQueue<String> pq = new PriorityQueue<>();
        for(int t=0;t<a;t++){
            st = new StringTokenizer(br.readLine());
            String s1 = st.nextToken();
            ar.add(s1);
            String s2 = st.nextToken();
            if(hm1.containsKey(s1)){
                hm1.get(s1).add(s2);
            }
            else {
                hm1.put(s1,new ArrayList<>());
                hm1.get(s1).add(s2);
            }
            if(hm2.containsKey(s2)){
                hm2.replace(s2,hm2.get(s2)+1);
            }
            else hm2.put(s2,1);
        }

        for(int i=0;i<ar.size();i++){
            String s = ar.get(i);
            if(!hm2.containsKey(s)&& !hs.contains(s)){
                hs.add(s);
                pq.add(s);
            }
        }
        StringBuilder sb = new StringBuilder();
        ArrayList<String> arr = new ArrayList<>();
        while(!pq.isEmpty()){
            arr.clear();
            int x = pq.size();
            for(int i=0;i<x;i++){
                String s = pq.poll();
                sb.append(s+"\n");
                if(hm1.containsKey(s)){
                    for(String j : hm1.get(s)){
                        if(hm2.get(j)==1){
                            hm2.remove(j);
                            arr.add(j);
                        }
                        else hm2.replace(j,hm2.get(j)-1);
                    }
                }
            }
            for(int i=0;i<arr.size();i++){
                pq.add(arr.get(i));
            }
        }
        if(hm2.isEmpty())
            System.out.println(sb);
        else System.out.println(-1);
    }
}
