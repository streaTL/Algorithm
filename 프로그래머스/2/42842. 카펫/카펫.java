class Solution {
    public int[] solution(int brown, int yellow) {
        int x=0,y=0;
        
        // if(yellow%2==1){
        //     x=yellow+2;
        //     y=3;
        // }
        int sum=0;
        for(int i=1;i<=yellow;i++){
            if(yellow%i==0){
                if((i*2)+((yellow/i)*2)+4==brown){
                    x=(yellow/i)+2;
                    y=i+2;
                    break;
                }
            }
        }
        
        int[] answer = {x,y};
        return answer;
    }
}