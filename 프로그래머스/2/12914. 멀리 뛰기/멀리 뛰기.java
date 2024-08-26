class Solution {
    public long solution(int n) {
        long answer = 1;
        long n1=1;
        long n2=2;
        if(n==2)
            answer=2;
        else if(n==1)
            answer=1;
        else{
            for(int i=3;i<=n;i++){
                answer=n1+n2;
                n1=n2;
                n2=answer;
                n1=n1%1234567;
                n2=n2%1234567;
                answer=answer%1234567;
            }
        }
        return answer%1234567;
    }
    
    // private static void m(int x,int n){
    //     if(i>1234567)
    //         i-=1234567;
    //     if(x==n)
    //         i++;
    //     else if(x<n){
    //         m(x+1,n);
    //         m(x+2,n);
    //     }
    // }
    
}