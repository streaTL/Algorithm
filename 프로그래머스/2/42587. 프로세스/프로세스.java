import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Queue<Integer> q = new LinkedList<>();
        // System.out.println(q.size());
        for(int i : priorities){
            pq.add(i);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i : priorities){
            arr.add(i);
            q.add(i);
        }
        while(!q.isEmpty()){
            // System.out.println(location);
            if(q.peek()==pq.peek()){
                q.poll();
                pq.poll();
                answer++;
                if(location==0)
                    break;
                location--;
            }
            else{
                q.add(q.poll());
                if(location==0){
                    location=pq.size()-1;
                }
                else
                    location--;
            }
            
            
        }
        
        return answer;
    }
}