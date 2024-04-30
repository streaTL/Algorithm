import java.util.Arrays;
class Solution
{
    public int solution(int []A, int []B)
    {
        int x=A.length;
        int a=0;
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        // while(x>0){
        //     for(int i=0;i<x-1;i++){
        //     if(A[i]>A[i+1]){
        //         a=A[i+1];
        //         A[i+1]=A[i];
        //         A[i]=a;
        //     }
        //     if(B[i]>B[i+1]){
        //         a=B[i+1];
        //         B[i+1]=B[i];
        //         B[i]=a;
        //     }
        // }
        //     x--;
        // }
        for(int i=0,j=A.length-1;i<A.length;i++){
            answer+=A[i]*B[j];
            j--;
        }
        
        

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        // System.out.println("Hello Java");

        return answer;
    }
}