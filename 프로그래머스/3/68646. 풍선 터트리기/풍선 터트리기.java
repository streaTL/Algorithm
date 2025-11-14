class Solution {
    public int solution(int[] a) {
        int answer = 0;
        int[] dp1 = new int[a.length+2];
        int[] dp2 = new int[a.length+2];
        dp1[dp1.length-1]=2000000000;
        dp2[dp1.length-1]=2000000000;
        dp1[0]=2000000000;
        dp2[0]=2000000000;
        for(int i=1;i<=a.length;i++){
            dp1[i]=Math.min(dp1[i-1],a[i-1]);
        }
        for(int i=a.length;i>=1;i--){
            dp2[i]=Math.min(dp2[i+1],a[i-1]);
        }
        for(int i=0;i<a.length;i++){
            int x = 0;
            if(a[i]!=dp1[i+1])
                x++;
            if(a[i]!=dp2[i+1])
                x++;
            if(x<2)
                answer++;
        }
        return answer;
    }
}