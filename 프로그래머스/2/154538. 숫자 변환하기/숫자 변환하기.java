import java.util.*;
class Solution {
    public int solution(int x, int y, int n) {

        // int[] arr = new int[y+1];
        // Arrays.fill(arr,99999999);
        boolean[] brr = new boolean[y+1];
        Queue<Integer> q = new LinkedList<>();
        q.add(x);
        int answer = 0;
        while(!q.isEmpty()){
            int z = q.size();
            for(int i=0;i<z;i++){
                int a = q.poll();
                if(a==y){
                    return answer;
                }
                if(a+n<=y&&!brr[a+n]){
                    brr[a+n]=true;
                    q.add(a+n);
                }
                if(a*2<=y&&!brr[a*2]){
                    brr[a*2]=true;
                    q.add(a*2);
                }
                if(a*3<=y&&!brr[a*3]){
                    brr[a*3]=true;
                    q.add(a*3);
                }
            }
            answer++;
        }
        
        return -1;
    }
    
}