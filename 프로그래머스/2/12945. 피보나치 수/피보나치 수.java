class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int x=0;
        int y=1;
        int z=0;
        for(int i=0;i<n-1;i++){
            z=x;
            x=y;
            y=z+y;
            if(y>1234567)
                y-=1234567;
        }
        answer=y%1234567;
        return answer;
    }
}