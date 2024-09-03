import java.util.*;
class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        PriorityQueue<Integer> q1 = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> q2 = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<A.length;i++){
            q1.offer(A[i]);
            q2.offer(B[i]);
        }
        while(!q1.isEmpty()){
            if(q1.peek()<q2.peek()){
                // System.out.print(q1.peek()+" "+q2.peek()+"\n");
                answer++;
                q1.poll();
                q2.poll();
            }
            else
                q1.poll();
        }
        return answer;
    }
}