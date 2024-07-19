import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 1;
        int x=0;
        int[] arr = new int[10000000];
        for(int i=0;i<tangerine.length;i++){
            arr[tangerine[i]-1]++;
        }
        Arrays.sort(arr);
        for(int i=9999999;i>=0;i--){
            x+=arr[i];
            if(x>=k)
                break;
            answer++;
        }
        return answer;
    }
}