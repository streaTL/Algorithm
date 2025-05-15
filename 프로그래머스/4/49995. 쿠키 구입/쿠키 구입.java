class Solution {
    public int solution(int[] cookie) {
        int answer = 0;
        int a=0;
        for(int i=0;i<cookie.length;i++){
            a+=cookie[i];
        }
        
        int start = 0;
        int end = cookie.length-1;
        for(int i=0;i<cookie.length-1;i++){
            int left = cookie[i];
            int right = cookie[i+1];
            int x = i;
            int y = i+1;
            while(x>=0&&y<cookie.length){
                if(left==right){
                    answer = Math.max(answer,left);
                    x--;
                    y++;
                    if(x<0||y==cookie.length)
                        break;
                    left+=cookie[x];
                    right+=cookie[y];
                }
                else if(left>right){
                    y++;
                    if(y==cookie.length)
                        break;
                    right+=cookie[y];
                }
                else{
                    x--;
                    if(x<0)
                        break;
                    left+=cookie[x];
                }
            }
        }
        return answer;
    }
}