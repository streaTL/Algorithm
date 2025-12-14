import java.util.*;
class Solution {
    public int solution(int[] order) {
        int answer = 0;
        
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=order.length;i++){
            q.add(i);
        }
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<order.length;i++){
            if(!q.isEmpty()&&order[i]>=q.peek()){
                while(order[i]!=q.peek()){
                    s.add(q.poll());
                }
                answer++;
                q.poll();
            }
            else if(s.peek()==order[i]){
                s.pop();
                answer++;
            }
            else break;
        }
        
        return answer;
    }
}