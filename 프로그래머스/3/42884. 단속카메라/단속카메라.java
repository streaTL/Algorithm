import java.util.*;
class Solution {
    public int solution(int[][] routes) {
        int answer = 0;
        int a=1;
        int n=30000;
        Arrays.sort(routes,(x,y)->{return x[0]-y[0];});
        for (int[] route : routes) {
            if (route[0] > n) {
                a += 1;
                n = route[1];
            }
            if (n > route[1])
                n = route[1];
        }
        return a;
    }
}