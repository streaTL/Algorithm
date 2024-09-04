import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        HashMap<String,Integer> hm = new HashMap<>();
        for(int i=0;i<clothes.length;i++){
            if(hm.containsKey(clothes[i][1]))
                hm.replace(clothes[i][1],hm.get(clothes[i][1])+1);
            else
                hm.put(clothes[i][1],1);
        }
        int a=1;
        answer=-1;
        for(String s : hm.keySet()){
            a*=hm.get(s)+1;
        }
        answer+=a;
        
            return answer;
    }
}