import java.util.*;
class Solution {
    public int[] solution(int n, long left, long right) {
        
        int[] answer = new int[(int)(right-left)+1];
        int x=0;
        for(long i=left;i<=right;i++){
            if((int)(i%n)==n-1)
                answer[x]=n;
            else{
                if((int)(i%n)>(int)(i/n))
                    answer[x]=(int)(i%n)+1;
                else
                    answer[x]=(int)(i/n)+1;
            }
            x++;
        }
        
        return answer;
    }
}