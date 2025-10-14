class Solution {
    int solution(int[][] land) {
        int answer = 0;
        for(int i=1;i<land.length;i++){
            for(int j=0;j<4;j++){
                int x = 0;
                for(int k=0;k<4;k++){
                    if(k==j)
                        continue;
                    x = Math.max(x,land[i-1][k]);
                }
                land[i][j]+=x;
            }
        }
        for(int i=0;i<4;i++)
            answer = Math.max(answer,land[land.length-1][i]);
        return answer;
    }
}