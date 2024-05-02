import java.util.*;
class Solution {
    static int[] arr;
    public int findp(int x){
        if(arr[x]==x)
            return x;
        else 
            return arr[x] = findp(arr[x]);
    }
    
    public int solution(int n, int[][] costs) {
        int answer = 0;
        arr = new int[n];
        Arrays.sort(costs,(x,y)->(x[2]-y[2]));
        
        for(int i=0;i<n;i++){
            arr[i]=i;
        }
        for(int[]i : costs){
            if(findp(i[0])!=findp(i[1])){
                // arr[i[1]]=arr[i[0]];
                // for(int j=0;j<n;j++){
                //     if(arr[j]==arr[i[1]])
                //         arr[j]=arr[i[0]];
                // }
                arr[findp(i[1])]=findp(i[0]);
                answer+=i[2];
            }
        }
        return answer;
    }
}