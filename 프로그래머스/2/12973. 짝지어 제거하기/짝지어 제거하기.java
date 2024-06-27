import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = -1;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        // System.out.println("Hello Java");

        ArrayList<Character> arr = new ArrayList<>();
        arr.add(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(arr.size()==0){
                arr.add(s.charAt(i));
                continue;
            }
            if(arr.get(arr.size()-1)==s.charAt(i)){
                arr.remove(arr.size()-1);
            }
            else
                arr.add(s.charAt(i));
        }
        if(arr.size()>0)
            answer=0;
        else
            answer=1;
        return answer;
    }
}