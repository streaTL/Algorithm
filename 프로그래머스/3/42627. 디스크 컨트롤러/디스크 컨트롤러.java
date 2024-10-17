import java.util.*;
class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        PriorityQueue<int[]> pq2 = new PriorityQueue<>((x,y)->x[0]-y[0]);
        PriorityQueue<int[]> pq1 = new PriorityQueue<>((x,y)->x[1]-y[1]);
        
        for(int[] i : jobs){
            pq2.offer(i);
        }
        int time=0;
        while(!pq2.isEmpty()||!pq1.isEmpty()){
            while(true){
                if(!pq2.isEmpty()&&pq2.peek()[0]<=time)
                    pq1.offer(pq2.poll());
                else
                    break;
            }
            if(pq1.isEmpty()&&!pq2.isEmpty()){
                time=pq2.peek()[0];
                continue;
            }
            // if(time>=pq1.peek()[0])
            answer+=time-pq1.peek()[0]+pq1.peek()[1];
            time+=pq1.poll()[1];
            // else
                // answer+=pq1.peek()[0]-time+pq1.poll()[1];
            // System.out.println(answer);
        }
        // System.out.println(jobs.length);
        return answer/jobs.length;
    }
}