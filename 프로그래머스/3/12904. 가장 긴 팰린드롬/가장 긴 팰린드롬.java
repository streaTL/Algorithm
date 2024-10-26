class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        for(int i=0;i<s.length();i++){
//            String x="";
            for(int j=i;j<s.length();j++){
//                x+=s.charAt(j);
                if(pal(s,i,j)==0)
                    answer=Math.max(answer,j-i+1);
            }
        }
        return answer;
    }
    static int pal(String s,int a,int b){
        int x=0;
        while(a<b){
            if(s.charAt(a++)!=s.charAt(b--)){
                x=1;
                break;
            }
        }
        return x;
    }
}