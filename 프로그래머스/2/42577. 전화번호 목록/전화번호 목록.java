import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashSet<String> hs = new HashSet<>();
        for(String i : phone_book){
            hs.add(i);
        }
        int x=0;
        String s = "";
        for(String i : phone_book){
            for(int j=1;j<i.length();j++){
                s = i.substring(0,j);
                // System.out.println(s);
                if(hs.contains(s)){
                    x=1;
                    break;
                }
            }
            if(x>0){
                answer=false;
                break;
            }
            
        }
        
        return answer;
    }
}