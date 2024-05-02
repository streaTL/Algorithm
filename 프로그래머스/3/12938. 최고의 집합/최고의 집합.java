class Solution {
    public int[] solution(int n, int s) {
        int[] answer;
        
        int[] arr = new int[n];
    
    if(s/n==0){
        answer = new int[1];
        answer[0]=-1;        
    }
    else{
        for(int i=0;i<n;i++){
            if(i<n-s%n)
                arr[i]=s/n;
            else
                arr[i]=(s/n)+1;
        }
        answer=arr;
    }
        
        return answer;
    }
}