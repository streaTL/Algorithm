import java.util.*;
class Solution {
    public int solution(int n, int[][] computers) {
        
        Queue<Integer> q = new LinkedList<>();
        int answer = 0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=0;
        }
        for(int i=0;i<n;i++){
            if(arr[i]==1)
                continue;
            q.offer(i);
            while(!q.isEmpty()){
                arr[q.peek()]=1;
                for(int j=0;j<n;j++){
                if(computers[q.peek()][j]==1&&arr[j]==0){
                    q.offer(j);
                    // arr[j]=1;
                }
                    
                }
                q.poll();
            }
            answer++;
        }
        
        return answer;
    }
}