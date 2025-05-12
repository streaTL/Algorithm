class Solution {
    public int solution(int[] money) {
        if(money.length==3){
            if(money[0]>=money[1]&&money[0]>=money[2])
                return money[0];
            else if(money[1]>=money[0]&&money[1]>=money[2])
                return money[1];
            else if(money[2]>=money[0]&&money[2]>=money[1])
                return money[2];
        }
        int[] dp1 = new int[money.length];
        int[] dp2 = new int[money.length];
        dp1[0]=money[0];
        dp1[1]=money[1];
        dp1[2]=money[2]+money[0];
        dp2[0]=0;
        dp2[1]=money[1];
        dp2[2]=money[2];
        for(int i=3;i<money.length-1;i++){
            dp1[i]=Math.max(dp1[i-2],dp1[i-3])+money[i];
        }
        for(int i=3;i<money.length;i++){
            dp2[i]=Math.max(dp2[i-2],dp2[i-3])+money[i];
        }
        return Math.max(Math.max(dp1[money.length-2],dp1[money.length-3]),Math.max(dp2[money.length-1],dp2[money.length-2]));
    }
}