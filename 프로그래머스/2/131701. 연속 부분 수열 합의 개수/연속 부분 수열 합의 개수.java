import java.util.*;
class Solution {
    
    public int solution(int[] elements) {
        // ArrayList<Integer> are = new ArrayList<>();
        HashSet<Integer> are = new HashSet<>();
        int answer = 1;
        int a=0;
        for(int i=1;i<=elements.length;i++){
            for(int j=0;j<elements.length;j++){
                a=0;
                for(int k=0;k<i;k++){
                    if((j+k)<elements.length)
                        a+=elements[j+k];
                    else
                        a+=elements[j+k-elements.length];
                }
                are.add(a);
            }
        }
        // for(int i=0;i<are.size();i++){
        //     System.out.print(are.get(i)+" ");
        // }
        // System.out.println();
        // Collections.sort(are);
        // for(int i=0;i<are.size();i++){
        //     System.out.print(are.get(i)+" ");
        // }
        // for(int i=0;i<are.size()-1;i++){
        //     if(are.get(i)!=are.get(i+1))
        //         answer++;
        // }
        // if(are.get(are.size()-1)!=are.get(are.size()-2))
        //     answer++;
        answer=are.size();
        return answer;
    }
    
}