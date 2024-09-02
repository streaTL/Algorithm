class Solution {
    public int solution(int n) {
        int answer = 1;
        int a=1,sum=0;
        
        for(int i=1;i<n/2+1;i++){
            sum=0;
            for(int j=i;j<n/2+2;j++){
                sum+=j;
                // System.out.println(sum);
                if(sum==n){
                    // System.out.println(sum);
                    answer++;
                    sum=0;
                    break;
                }
                else if(sum>n){
                    sum=0;
                    break;
                }   
            }
        }
        return answer;
    }
}