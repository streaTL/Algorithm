import java.util.*;
class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        long y=0;
        Arrays.sort(times);
        long x = (long)n*(long)times[0];
        // long x = Long.MAX_VALUE;
        long z = x/2;
        long zz = 0;
        while(true){
            y=0;
            if(zz-x==0||zz-x==-1||zz-x==1){
                break;
            }
            long ee = ((x+zz))/2;
            for(int i : times){
                y+=ee/(long)i;
            }
            if(y>=n){
                // x-=z;
                // z/=2;
                x=(x+zz)/2;
            }
            else{
                // x+=z;
                zz=(x+zz)/2;
            }
            System.out.println(x);
        }
        y=0;
        for(int i : times){
                y+=x/(long)i;
            }
        if(y<(long)n)
            x+=1;
        answer=x;
        y=0;
        long tt = x-1;
        for(int i : times){
                y+=tt/(long)i;
            }
        if(y==(long)n)
            answer=tt;
        return answer;
    }
}