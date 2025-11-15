class Solution {
    static int[][] arr;
    public int solution(int n, int[][] results) {
        int answer = 0;
        arr = new int[n+1][n+1];
        for(int i=0; i<results.length;i++){
            dfs(results[i][0],results[i][1],n);
        }
        for(int[] i : arr){
            int sum=0;
            for(int j : i){
                if(j!=0)
                    sum++;
            }
            if(sum==n-1)
                answer++;
        }
        
        return answer;
    }
    
    private static void dfs(int t, int m, int n){
        arr[t][m]=-1;
        arr[m][t]=1;
        for(int i=1;i<=n;i++){
            if(arr[t][i]==1){
                if(arr[m][i]==0){
                    arr[m][i]=1;
                    dfs(i,m,n);
                }
            }
            if(arr[m][i]==-1){
                if(arr[t][i]==0){
                    arr[t][i]=-1;
                    dfs(t,i,n);
                }
            }
        }
    }
}