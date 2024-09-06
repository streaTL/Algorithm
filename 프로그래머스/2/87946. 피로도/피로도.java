import java.util.*;
class Solution {
    static int x=0;
    static int y=0;
    static boolean[] brr={};
    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        brr= new boolean[dungeons.length];
        dfs(dungeons,k,0);
        answer=x;
        return answer;
    }
    
    public static void dfs(int[][]dg, int a, int c){
        
        // if(b==dg.length){
        //     x=dg.length;
        //     return;
        // }
        // if(y>x)
        //     x=y;
        if(c>x)
            x=c;
        // &&brr[i]==false
        for(int i=0;i<dg.length;i++){
            if(a>=dg[i][0]&&!brr[i]){
                brr[i]=true;
                dfs(dg,a-dg[i][1],c+1);
                brr[i]=false;
                // brr[i]=true;
            }
            // dfs(dg,a,c);
            
        }
        
    }
    
}