class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int a=1;
        int x=0;
        while(true){
            for(int i=0;i<arr.length;i++){
                if(a%arr[i]!=0){
                    x=1;
                    break;
                }
            }
            if(x==0)
                break;
            a++;
            x=0;
        }
        
        return a;
    }
}