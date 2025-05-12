import java.util.*;
class Solution {
    static HashMap<Long,Long> hm;
    public long[] solution(long k, long[] room_number) {
        long[] answer = new long[room_number.length];
        hm = new HashMap<>();
        long a;
        for(int i=0;i<room_number.length;i++){
            if(hm.containsKey(room_number[i])){
                a=hm.get(room_number[i]);
                a = find(a);
                answer[i]=a;
                hm.put(a,a+1);
            }
            else{
                hm.put(room_number[i],room_number[i]+1);
                answer[i]=room_number[i];
            }
        }
        return answer;
    }
    public static long find(long a){
        if(!hm.containsKey(a))
            return a;
        long x = find(hm.get(a));
        hm.replace(a,x);
        return x;
    }
}