import java.util.*;
class Solution {
    public int[] solution(String[] gems) {
        int[] answer = new int[2];
        HashSet<String> hs = new HashSet<>();
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i=0;i<gems.length;i++){
            hs.add(gems[i]);
        }
        int x=0;
        int res=1000000;
        for(int i=0;i<gems.length;i++){
            if(hm.containsKey(gems[i])){
                hm.replace(gems[i],hm.get(gems[i])+1);
            }
            else{
                hm.put(gems[i],1);
            }
            if(hs.size()==hm.size()){
                if(res>i-x){
                    res=i-x;
                    answer[0]=x+1;
                    answer[1]=i+1;
                }
                while(hs.size()==hm.size()){
                    if(hm.get(gems[x])>1){
                        hm.replace(gems[x],hm.get(gems[x])-1);
                        x++;
                        if(res>i-x){
                            res=i-x;
                            answer[0]=x+1;
                            answer[1]=i+1;
                        }   
                    }
                    else{
                        hm.remove(gems[x]);
                        x++;
                    }
                }
            }
        }
        return answer;
    }
}