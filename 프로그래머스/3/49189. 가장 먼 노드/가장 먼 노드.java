import java.util.*;
class Solution {
    public int solution(int n, int[][] edge) {
        
        int size=0;
        int[] ar = new int[n+1];
        ar[1]=1;      
        // int[][] arr = new int[n+1][n+1];
        // for(int i=0;i<edge.length;i++){
        //     arr[edge[i][0]][edge[i][1]]=1;
        //     arr[edge[i][1]][edge[i][0]]=1;
        // }
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        // while(!q.isEmpty()){
        //     size = q.size();
        //     for(int x=0;x<size;x++){
        //     for(int i=1;i<n+1;i++){
        //         if(arr[q.peek()][i]==1&&ar[i]!=1){
        //             q.offer(i);
        //             ar[i]=1;
        //         }
        //     }
        //     q.poll();
        //     }
        // }
        
        while(!q.isEmpty()){
            size = q.size();
            for(int x=0;x<size;x++){
            for(int i=0;i<edge.length;i++){
                if(edge[i][1]==q.peek()&&ar[edge[i][0]]!=1){
                    q.offer(edge[i][0]);
                    ar[edge[i][0]]=1;
                }
                else if(edge[i][0]==q.peek()&&ar[edge[i][1]]!=1){
                    q.offer(edge[i][1]);
                    ar[edge[i][1]]=1;
                }
            }
            q.poll();
            }
        }
        
        int answer = size;
        return answer;
    }
}