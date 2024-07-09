import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        int a=0;
        int b=0;
        for(int i=people.length-1;i>=0;i--){
            if(b>i)
                break;
            a=people[i];
            if(a+people[b]<=limit){
                b+=1;
            }
            answer++;
        }
        return answer;
    }
}