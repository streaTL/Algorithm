class Solution {
    public int solution(int[] num_list) {
        
        int x=0, y=0;
        int answer = 0;
        for(int i=0,j=1 ;i<num_list.length;i+=2){
            x+=num_list[i];
            if(j<num_list.length){
              y+=num_list[j];
                j+=2;
            }
        }
        if(x>y)
            answer=x;
        else
            answer=y;
        return answer;
    }
}