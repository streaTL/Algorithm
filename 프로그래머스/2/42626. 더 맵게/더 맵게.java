import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        int sum=0;
        int x=scoville[0];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // Arrays.sort(scoville);
        for(int i : scoville)
            pq.add(i);
        
        while(!pq.isEmpty()){
            if(pq.peek()<K&&pq.size()==1){
                answer=-1;
                break;
            }
            if(pq.peek()>=K){
                break;
            }
            else{
                pq.add(pq.poll()+pq.poll()*2);
                answer++;
            }
        }
        
        
//         for(int i=0;i<scoville.length-1;i++){
            
//             if(x>=K){
//                 break;
//             }
//             if(x>scoville[i+1]){
//                 x=x*2+scoville[i+1];
//                 answer++;
//             }
//             else{
//                 x=x+scoville[i+1]*2;
//                 answer++;
//             }
//             // System.out.println(x+" "+i);
//             if(x>=K){
//                 sum=1;
//                 if(i<scoville.length-2)
//                     x=scoville[i+2];
//                 i++;
//             }
            
//         }
        // if(scoville[0]>=K)
        //     answer=0;
        // if(x<K&&sum==1)
        //     answer++;
        // else if(x<K&&sum==0)
        //     answer=-1;
        
        return answer;
    }
}