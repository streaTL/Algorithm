class Solution {
    public long solution(int[] sequence) {
        long answer = 0;
        int[] arr1 = new int[sequence.length];
        int[] arr2 = new int[sequence.length];
        boolean b=true;
        for(int i=0;i<sequence.length;i++){
            if(b){
                arr1[i]=sequence[i];
                arr2[i]=-sequence[i];
            }
            else{
                arr1[i]=-sequence[i];
                arr2[i]=sequence[i];
            }
            b=!b;
        }
        long max=0;
        long h=0;
        for(int i=0;i<sequence.length;i++){
            h=h+arr1[i];
            if(h>max){
                max=h;
            }
            else if(h<0){
                h=0;
            }
        }
        h=0;
        for(int i=0;i<sequence.length;i++){
            h=h+arr2[i];
            if(h>max){
                max=h;
            }
            else if(h<0){
                h=0;
            }
        }
        answer=max;
        return answer;
    }
}