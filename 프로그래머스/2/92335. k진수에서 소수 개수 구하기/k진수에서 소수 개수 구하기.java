import java.util.*;
class Solution {
    public int solution(int n, int k) {
        int answer = 0;

        ArrayList<Integer>ar = new ArrayList<>();

        while(n>=k){
            ar.add(0,n%k);
            n=n/k;
            if(n<k)
                ar.add(0,n);
        }
        String x="";
        for(int i : ar)
            x+=i;
        String[] xr = x.split("0");
        for(String i : xr){
            if(i.length()>=1){
                long b = Long.parseLong(i);
                int a = (int)Math.sqrt(b);
                int c=0;
                for(int j=2;j<=a;j++){
                    if(b%j==0){
                       c=1;
                        break;
                    }
                }
            if(c==0&&b!=1)
                answer++; 
            }
            
        }
        return answer;
    }
}