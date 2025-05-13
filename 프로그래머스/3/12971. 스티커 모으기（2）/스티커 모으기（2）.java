class Solution {
    public int solution(int sticker[]) {
        int answer = 0;
        int[] dp1 = new int[sticker.length];
        int[] dp2 = new int[sticker.length];
        if(sticker.length==1){
            return sticker[0];
        }
        else if(sticker.length==2)
            return Math.max(sticker[0],sticker[1]);
        dp1[0]=0;
        dp1[1]=sticker[1];
        dp1[2]=sticker[2];
        dp2[0]=sticker[0];
        dp2[1]=sticker[1];
        dp2[2]=sticker[2]+dp2[0];
        for(int i=3;i<sticker.length;i++){
            dp1[i] = Math.max(dp1[i-2],dp1[i-3])+sticker[i];
        }
        for(int i=3;i<sticker.length-1;i++){
            dp2[i] = Math.max(dp2[i-2],dp2[i-3])+sticker[i];
        }
        int x = dp1.length;
        answer = Math.max(Math.max(dp1[x-1],dp1[x-2]),Math.max(dp2[x-2],dp2[x-3]));
        return answer;
    }
}