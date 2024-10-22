import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int co = Integer.parseInt(st.nextToken());

        for(int cu=0;cu<co;cu++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());

            Deque<Integer> dq = new ArrayDeque<>();

            PriorityQueue<Integer> pq1 = new PriorityQueue<>();
            PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
            int num=0;

            HashMap<Integer, Integer> hm = new HashMap<>();

            for(int i=0;i<a;i++){
                st = new StringTokenizer(br.readLine());
                String b = st.nextToken();
                int c = Integer.parseInt(st.nextToken());
                if(b.equals("I")){
                    if(hm.containsKey(c)){
                        hm.replace(c,hm.get(c)+1);
                    }
                    else{
                        hm.put(c,1);
                    }
                    pq1.add(c);
                    pq2.add(c);
                    num++;
                }
                else{
                    if(c==1&&num>0){
                        int x= pq2.poll();
                        while(hm.get(x)==0){
                            x=pq2.poll();
                        }
                        if(hm.get(x)>0){
                            hm.replace(x,hm.get(x)-1);
                            num--;
                        }
                    }
                    else if(c==-1&&num>0){
                        int x=pq1.poll();
                        while(hm.get(x)==0){
                            x=pq1.poll();
                        }
                        if(hm.get(x)>0){
                            hm.replace(x,hm.get(x)-1);
                            num--;
                        }
                    }
                }
            }

            if(num==0){
                System.out.println("EMPTY");
            }
            else{
                int x = pq1.poll();
                while(hm.get(x)==0){
                    x= pq1.poll();
                }
                int y = pq2.poll();
                while(hm.get(y)==0){
                    y= pq2.poll();
                }
                System.out.println(y+" "+x);
            }

        }

    }
}
