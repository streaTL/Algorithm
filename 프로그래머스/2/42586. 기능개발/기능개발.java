import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        int x=0;
        int y=0;
        int z=0;
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<speeds.length;i++){
            x = 100-progresses[i];
            y = speeds[i];
            if(x%y==0)
                z=x/y;
            else
                z=(x/y)+1;
            q.offer(z);
        }
        int res = q.poll();
        int sum=1;
        int a=0;
        while(!q.isEmpty()){
            a=q.peek();
            if(res>=a){
                sum++;
                q.poll();
            }
            else{
                arr.add(sum);
                sum=1;
                res=q.poll();
            }
        }
        arr.add(sum);
        int[] answer = new int[arr.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=arr.get(i);
        }
        return answer;
    }
}