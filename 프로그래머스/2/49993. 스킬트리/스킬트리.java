import java.util.*;
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        HashSet<Character> hs = new HashSet<>();
        for(int i=0;i<skill.length();i++){
            hs.add(skill.charAt(i));
        }
        
        for(int i=0;i<skill_trees.length;i++){
            int a = 0;
            int b = 0;
            for(int j=0;j<skill_trees[i].length();j++){
                if(hs.contains(skill_trees[i].charAt(j))&&skill_trees[i].charAt(j)!=skill.charAt(a)){
                    b=1;
                    break;
                }
                else if(hs.contains(skill_trees[i].charAt(j))&&skill_trees[i].charAt(j)==skill.charAt(a)){
                    a++;
                }
            }
            if(b==0)
                answer++;
        }
        return answer;
    }
}