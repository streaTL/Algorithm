class Solution {
    public int solution(int n) {
        int answer = 0;
        int a=0,b=0,cd=n+1;
        while(n>0){
            if(n%2==1)
                a++;
            n/=2;
        }
        while(true){
            int c=cd;
            while(c>0){
            if(c%2==1)
                b++;
            c/=2;
            }
            if(b==a)
                break;
            else{
                b=0;
                cd++;
            }
        }
        answer=cd;
        return answer;
    }
}