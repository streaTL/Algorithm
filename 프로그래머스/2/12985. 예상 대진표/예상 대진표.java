class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;
        
        while(true){
            if(a%2==1)
                a++;
            if(b%2==1)
                b++;
            
            if(a==b)
                break;
            if(a>2)
                a/=2;
            if(b>2)
                b/=2;
            answer++;
        }

        return answer;
    }
}