import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        int answer = 1;
        int stop=0;
        q1.add(0);
        q2.add(0);
        maps[0][0]=0;
        while(!q1.isEmpty()){
            int t = q1.size();
            for(int i=0;i<t;i++){
                if(q1.peek()==maps.length-1&&q2.peek()==maps[0].length-1){
                    stop=1;
                    break;
                }
            if(q1.peek()+1<maps.length&&maps[q1.peek()+1][q2.peek()]==1){
                q1.add(q1.peek()+1);
                q2.add(q2.peek());
                maps[q1.peek()+1][q2.peek()]=0;
            }
            if(q2.peek()+1<maps[0].length&&maps[q1.peek()][q2.peek()+1]==1){
                q1.add(q1.peek());
                q2.add(q2.peek()+1);
                maps[q1.peek()][q2.peek()+1]=0;
            }
            if(q1.peek()-1>=0&&maps[q1.peek()-1][q2.peek()]==1){
                q1.add(q1.peek()-1);
                q2.add(q2.peek());
                maps[q1.peek()-1][q2.peek()]=0;
            }
            if(q2.peek()-1>=0&&maps[q1.peek()][q2.peek()-1]==1){
                q1.add(q1.peek());
                q2.add(q2.peek()-1);
                maps[q1.peek()][q2.peek()-1]=0;
            }
                q1.poll();
                q2.poll();
            }
            if(stop==1)
                break;
            answer++;
        }
        if(q1.isEmpty())
            answer=-1;
        return answer;
    }
}