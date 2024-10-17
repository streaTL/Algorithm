import java.util.*;
class Solution {
    static ArrayList<int[]> ar;
    public int[][] solution(int n) {
        int[][] answer;
        ar=new ArrayList<>();
        dfs(n,1,3,2);
        answer=new int[ar.size()][];
        for(int i=0;i<answer.length;i++){
            answer[i]=ar.get(i);
        }
        return answer;
    }
    
    static void dfs(int n,int st,int to, int mi){
        
        if(n==1){
            // System.out.println(st+" "+to);
            ar.add(new int[]{st,to});
            return;
        }
        dfs(n-1,st,mi,to);
        // System.out.println(st+" "+to);
        ar.add(new int[]{st,to});
        dfs(n-1,mi,to,st);
    }
}