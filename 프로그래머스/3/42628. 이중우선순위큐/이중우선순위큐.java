import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        int[] answer;
        // PriorityQueue<Integer> q1 = new PriorityQueue<>();
        // PriorityQueue<Integer> q2 = new PriorityQueue<>(Collections.reverseOrder());
        
        ArrayList<Integer> ar = new ArrayList<>();
        
        for(int i=0;i<operations.length;i++){
            int a = Integer.parseInt(operations[i].substring(2));
            if(operations[i].charAt(0)=='D'&&a==1&&ar.size()>0){
                Collections.sort(ar);
                ar.remove(ar.size()-1);
            }
            else if(operations[i].charAt(0)=='D'&&a==-1&&ar.size()>0){
                Collections.sort(ar);
                ar.remove(0);
            }
            else if(operations[i].charAt(0)=='I')
                ar.add(a);
        }
        Collections.sort(ar);
        if(ar.size()>0)
            answer = new int[]{ar.get(ar.size()-1),ar.get(0)};
        else
            answer = new int[]{0,0};
        return answer;
    }
}