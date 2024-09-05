import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int a=0;
        int b = citations.length;
        Arrays.sort(citations);
        for(int i=citations.length-1;i>=0;i--){
            a++;
            if(citations[i]<=a){
                answer=citations[i];
                break;
            }
            else
                answer=a;
        }
        for(int i=0;i<citations.length;i++){
            if(b>citations[i])
                b-=1;
        }
        

        return b;
    }
}