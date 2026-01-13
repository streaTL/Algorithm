import java.util.*;
class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        Stack<String> st = new Stack<>();
        for(int i=0;i<t*m;i++){
            int x = i;
            while(x>=n){
                // sb.append(x%n);
                if(x%n>=10){
                    st.add((char)('A'+x%n-10)+"");
                }
                else
                    st.add(x%n+"");
                x/=n;
            }
            if(x%n>=10){
                    sb.append((char)('A'+x%n-10)+"");
                }
            else
                sb.append(x);
            while(!st.isEmpty()){
                sb.append(st.pop());
            }
        }
        String s = sb.toString();
        for(int i=0;i<t;i++){
            answer+=s.charAt(i*m+p-1);
        }
        return answer;
    }
}