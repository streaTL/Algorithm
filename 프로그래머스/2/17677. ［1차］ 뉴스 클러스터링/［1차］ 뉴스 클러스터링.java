import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        HashMap<String, Integer> hm1 = new HashMap<>();
        HashMap<String, Integer> hm2 = new HashMap<>();
        HashSet<String> hs = new HashSet<>();
        List<String> ar = new ArrayList<>();
        for(int i=0;i<str1.length()-1;i++){
            String s = str1.substring(i,i+2);
            if(s.charAt(0)<'A'||s.charAt(0)>'Z'||s.charAt(1)<'A'||s.charAt(1)>'Z')
                continue;
            if(hm1.containsKey(s)){
                hm1.replace(s,hm1.get(s)+1);
            }
            else{
                hm1.put(s,1);
                hs.add(s);
                ar.add(s);
            }
        }
        for(int i=0;i<str2.length()-1;i++){
            String s = str2.substring(i,i+2);
            if(s.charAt(0)<'A'||s.charAt(0)>'Z'||s.charAt(1)<'A'||s.charAt(1)>'Z')
                continue;
            if(hm2.containsKey(s)){
                hm2.replace(s,hm2.get(s)+1);
            }
            else{
                hm2.put(s,1);
                if(!hs.contains(s)){
                    hs.add(s);
                    ar.add(s);
                }
            }
        }
        int a=0;
        int b=0;
        for(String s : ar){
            if(hm1.containsKey(s)&&hm2.containsKey(s)){
                a+=Math.min(hm1.get(s),hm2.get(s));
                b+=Math.max(hm1.get(s),hm2.get(s));
            }
            else if(hm1.containsKey(s)){
                b+=hm1.get(s);
            }
            else b+=hm2.get(s);
        }
        if(a==0&&b==0)
            return 65536;
        answer = a*65536/b;
        return answer;
    }
}