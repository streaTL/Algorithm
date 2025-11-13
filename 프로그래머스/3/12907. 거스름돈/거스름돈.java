class Solution {
    public int solution(int n, int[] money) {
        int answer = 0;
        long[] arr = new long[n+1];
        arr[0]=1;
        for(int i=0;i<money.length;i++){
            int x = money[i];
            for(int j=x;j<=n;j++){
                arr[j]+=arr[j-x];
                arr[j]%=1000000007;
            }
        }
        answer = (int)arr[n];
        return answer;
    }
}