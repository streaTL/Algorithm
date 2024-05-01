import java.util.*;
class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        int a=0,size=0,lv=0, sc=0;
        int[] vs = new int[words.length];
        Queue<String> q = new LinkedList<>();
        int b = begin.length();
        q.offer(begin);
        while(!q.isEmpty()){
            size=q.size();
            for(int x=0;x<size;x++){
                for(int i=0;i<words.length;i++){
                    a=0;
                    for(int j=0;j<b;j++){
                        if(q.peek().charAt(j)!=words[i].charAt(j)){
                            a++;
                        }
                    }
                    if(vs[i]!=1&&a==1){
                        q.offer(words[i]);
                        vs[i]=1;
                    }
                }
                if(q.peek().equals(target)){
                    sc=1;
                    break;
                }
                q.poll();
            }
            if(sc==1)
                break;
            lv++;
        }
        if(sc==1)
            answer=lv;
        return answer;
    }
}