import java.util.*;
class Solution {
    public int solution(int[] food_times, long k) {
        int answer = 0;
        int[] arr = new int[food_times.length];
        for(int i=0;i<food_times.length;i++)
            arr[i]=food_times[i];
        Arrays.sort(arr);
        long a = food_times.length;
        int b=0;
        long res=-1;
        for(int i=0;i<food_times.length;i++){
            if(b==arr[i]){
                a--;
                continue;
            }
            if(0>=k-a*(arr[i]-b)){
                if(k-a*(arr[i]-b)==0&&arr[i]==arr[food_times.length-1])
                    return -1;
                res=k%a;
                // k-=a*(arr[i]-b);
                break;
            }
            else{
                k-=(arr[i]-b)*a;
                b=arr[i];
                a--;
            }
        }
        int x=0;
        // System.out.println(a+" "+b+" "+res);
        if(res==-1){
            return -1;
        }
        for(int i=0;i<food_times.length;i++){
            if(food_times[i]>b)
                x++;
            if(x==res+1){
                answer=i+1;
                break;
            }
        }
        return answer;
    }
}