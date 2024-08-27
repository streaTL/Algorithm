class Solution {
    public String solution(String s) {
        String answer = "";
        int t=0;
        s=" "+s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if(i==s.length()-1&&s.charAt(i)==' '){
                answer+=s.charAt(i);
                break;
            }
                
            if(s.charAt(i)==' '&&s.charAt(i+1)!=' '){
                answer+=s.charAt(i);
                i++;
                if(i==s.length())
                    break;
                if(s.charAt(i)>'Z')
                    answer+=(char)(s.charAt(i)-32);
                else
                    answer+=s.charAt(i);
            }
            else
                answer+=s.charAt(i);
        }
        
        return answer.substring(1);
    }
}