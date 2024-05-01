import java.util.Arrays;
class Solution {
    boolean solution(String s) {
        boolean answer = true;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        // System.out.println("Hello Java");
        // char[] arr = s.toCharArray();
        // Arrays.sort(arr);
        // char a = s.charAt(0);
        // char b = s.charAt(s.length()-1);
        // if(a==')'||s.length()%2==1)
        //     answer=false;
        // if(b=='(')
        //     answer=false;
        // if(s.length()%2==0&&arr[s.length()/2-1]==')')
        //     answer=false;
        // if(s.length()%2==0&&arr[s.length()/2]=='(')
        //     answer=false;
        
        int a=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')
                a++;
            else
                a--;
            if(a<0){
                answer=false;
                break;
            }
        }
        if(a>0)
            answer=false;
        
        return answer;
    }
}