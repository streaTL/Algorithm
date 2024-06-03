class Solution {
    public int[] solution(String s) {
        
        int x=0,y=0,z=0;
        // String t=s;
        while(s.length()>1){
            
            for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')
                x++;
            else
                y++;
            }
            s="";
            while(x>0){
                s+=Integer.toString(x%2);
                x/=2;
            }
            z++;
        }
        int[] answer = {z,y};
        
        return answer;
    }
}