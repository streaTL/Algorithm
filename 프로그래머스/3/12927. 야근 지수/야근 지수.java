import java.util.*;
class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Integer x;
        for(int i:works){
            x=Integer.valueOf(i);
            pq.offer(x);
        }
        int a;
        for(int i=0;i<n;i++){
            a=pq.poll();
            if(a>0)
                a--;
            pq.offer(a);
        }
        while(!pq.isEmpty()){
            a=pq.poll();
            answer+=a*a;
        }
        
        
        return answer;
    }
}