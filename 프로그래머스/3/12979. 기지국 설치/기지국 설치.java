class Solution {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;

        int x=1;
        int y=2*w+1;
        for(int i : stations){
            if(i-w>x){
                answer+=(i-w-x)/y;
                if((i-w-x)%y!=0)
                    answer++;
            }
            x=i+w+1;
        }
        if(x<=n){
            answer+=(n-x+1)/y;
            if((n-x+1)%y!=0)
                answer++;
        }
        return answer;
    }
}