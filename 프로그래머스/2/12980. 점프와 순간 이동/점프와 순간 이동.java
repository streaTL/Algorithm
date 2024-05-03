import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 1;
        int size=0;
        while(n>0){
            if(n%2==1){
            n=n/2;
            size++;
            }
            else
                n=n/2;
        }

        return size;
    }
}