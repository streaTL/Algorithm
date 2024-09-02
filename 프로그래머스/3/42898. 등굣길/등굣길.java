import java.util.*;
class Solution {
    public int solution(int n, int m, int[][] puddles) {
        int answer = 0;
        // int size=1;
        // int ju=0;
        // Queue<int[]> q = new LinkedList<>();
        int[][] arr = new int[n+1][m+1];
        arr[1][1]=1;
        for(int i=0;i<puddles.length;i++){
            arr[puddles[i][0]][puddles[i][1]]=-1;
        }
        // q.offer(new int[]{1,1});
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(arr[i][j]==-1)
                    continue;
                if(arr[i-1][j]>0)
                    arr[i][j]+=arr[i-1][j];
                if(arr[i][j-1]>0)
                    arr[i][j]+=arr[i][j-1];
                arr[i][j]=arr[i][j]%1000000007;
            }
        }
        answer=arr[n][m]%1000000007;
        // while(!q.isEmpty()){
        //     size=q.size();
        //         if(q.peek()[0]==n&&q.peek()[1]==m){
        //             ju=1;
        //             answer=arr[n][m];
        //             break;
        //         }
        //             if((q.peek()[1])<m&&arr[q.peek()[0]][q.peek()[1]+1]!=-1){
        //                 if(arr[q.peek()[0]][q.peek()[1]+1]==0)
        //                     q.offer(new int[]{q.peek()[0],q.peek()[1]+1});
        //             arr[q.peek()[0]][q.peek()[1]+1]+=arr[q.peek()[0]][q.peek()[1]];
        //         }
        //             if((q.peek()[0])<n&&arr[q.peek()[0]+1][q.peek()[1]]!=-1){
        //                 if(arr[q.peek()[0]+1][q.peek()[1]]==0)
        //                     q.offer(new int[]{q.peek()[0]+1,q.peek()[1]});
        //             arr[q.peek()[0]+1][q.peek()[1]]+=arr[q.peek()[0]][q.peek()[1]];
        //         }
        //         q.poll();
        //     if(ju==1)
        //         break;
        // }
        return answer;
    }
}