import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        // int[] arr = new int[numbers.length];
        ArrayList<Integer> ar = new ArrayList<>();
        // int a=0;
        ar.add(numbers[numbers.length-1]);
        answer[numbers.length-1]=-1;
        // arr[numbers.length-1]=-1;
        // int x=0;
        // for(int i=numbers.length-2;i>=0;i--){
        //     if(numbers[i]==numbers[i+1]){
        //         answer[i]=answer[i+1];
        //         arr[i]=arr[i+1];
        //     }
        //     else if(numbers[i]>numbers[i+1]){
        //         answer[i]=-1;
        //         if(answer[i+1]==-1)
        //             continue;
        //         for(int j=1;j<numbers.length-i;j++){
        //             if(numbers[i]<numbers[i+j]){
        //                 answer[i]=numbers[i+j];
        //                 break;
        //             }
        //         }
        //     }
        //     else{
        //         answer[i]=numbers[i+1];
        //         arr[i]=i+1;
        //     }
        // }
        for(int i=numbers.length-2;i>=0;i--){
            while(!ar.isEmpty()){
            // for(int j=0;j<ar.size();j++){
                // System.out.println(ar.toString());
                if(numbers[i]<ar.get(0)){
                    ar.add(0,numbers[i]);
                    answer[i]=ar.get(1);  
                    break;
                }
                else{
                    // System.out.println(ar.toString());
                    ar.remove(0);
                }
                if(ar.size()==0){
                    ar.add(numbers[i]);
                    answer[i]=-1;
                    break;
                }
            }
        }
        
        return answer;
    }
}