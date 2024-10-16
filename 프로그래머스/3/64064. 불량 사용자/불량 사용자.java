import java.util.HashSet;

class Solution {
    static boolean[] br;
    static int sum=0;
    static HashSet<String> hs;
    public int solution(String[] user_id, String[] banned_id) {
        // int answer = 0;
        br=new boolean[user_id.length];
        hs= new HashSet<>();
        dfs(0,user_id,banned_id);
        return hs.size();
    }

    static void dfs(int a,String[] user, String[] ban){

        if(a==ban.length){
            String ss = "";
            for(int i=0;i< br.length;i++){
                if(br[i]){
                    ss+=i;
                }             
            }
            hs.add(ss);
            return;
        }
        for(int i=0;i<user.length;i++){
            if(!br[i]&&user[i].length()==ban[a].length()){
                int x=0;
                for(int j=0;j<user[i].length();j++){
                    if(ban[a].charAt(j)=='*'){
                        continue;
                    }
                    else if(user[i].charAt(j)!=ban[a].charAt(j)){
                        x=1;
                        break;
                    }
                }
                if(x==0){
                    br[i]=true;
                    dfs(a+1,user,ban);
                    br[i]=false;
                }

            }
        }
    }

}