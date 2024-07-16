class Solution {
    public int[] solution(int n, String[] words) {
        
        int a=0;
        int b=0;
        int x=0;
        for(int i=1;i<words.length;i++){
            for(int j=0;j<i;j++){
                if(words[j].equals(words[i])){
                    if((i+1)%n==0){
                    a=n;
                    b=(i+1)/n;
                }
                else{
                    b=(i+1)/n;
                    a=(i+1)%n;
                    b++;
                }
                    x=1;
                break;
                }
            }
            if(x==1)
                break;
            if(words[i-1].charAt(words[i-1].length()-1)!=words[i].charAt(0)){
                if((i+1)%n==0){
                    a=n;
                    b=(i+1)/n;
                }
                else{
                    b=(i+1)/n;
                    a=(i+1)%n;
                    b++;
                }
                break;
            }
        }
        int[] answer = {a,b};

        return answer;
    }
}