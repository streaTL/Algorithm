class Solution {
    static String[] srr={"A","E","I","O","U"};
    static int c=0;
    static int t=0;
    static String s ="";
    static boolean x=false;
    public int solution(String word) {
        int answer = 0;
        dfs(word,0);
        answer=t;
        // System.out.println(s);
        return answer;
    }
    private static void dfs(String word, int a){
        
        if(x)
            return;
        if(s.equals(word)){
            t=c;
            x=true;
            return;
        }
        if(a==5)
            return;
        for(int i=0;i<srr.length;i++){
            s+=srr[i];
            c++;
            dfs(word,a+1);
            s=s.substring(0,s.length()-1);
        }
    }


}