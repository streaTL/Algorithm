import java.util.Arrays;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int l,r,m;
        int w=0;
        Arrays.sort(sizes,(x,y)->(y[0]-x[0]));
        l=sizes[0][0];
        Arrays.sort(sizes,(x,y)->(y[1]-x[1]));
        r=sizes[0][1];
        if(l>r)
            m=l;
        else
            m=r;
        for(int i=0;i<sizes.length;i++){
            if(sizes[i][0]>sizes[i][1]&&sizes[i][1]>w){
                w=sizes[i][1];
            }
            else if(sizes[i][0]<=sizes[i][1]&&sizes[i][0]>w){
                w=sizes[i][0];
            }
        }
        answer = m*w;
        return answer;
    }
}