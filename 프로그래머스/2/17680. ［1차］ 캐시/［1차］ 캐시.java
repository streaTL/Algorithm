import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        int a=0;
        
        ArrayList<String> arr = new ArrayList<>();
        for(String s : cities){
            a=answer;
            for(int i=0;i<arr.size();i++){
                if(arr.get(i).equals(s.toLowerCase())){
                    arr.remove(i);
                    arr.add(s.toLowerCase());
                    answer++;
                    break;
                }
            }
            if(a==answer){
                if(arr.size()==cacheSize&&cacheSize!=0)
                    arr.remove(0);
                if(arr.size()<cacheSize)
                arr.add(s.toLowerCase());
                answer+=5;
            }
        }
        return answer;
    }
}