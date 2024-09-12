import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        int sum =0;
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        int[]arr1 = new int[topping.length];
        int[]arr2 = new int[topping.length];
        
        for(int i=0;i<topping.length-1;i++){
            hs.add(topping[i]);
            arr1[i]=hs.size();
        }
        for(int i=topping.length-1;i>0;i--){
            hs2.add(topping[i]);
            arr2[i-1]=hs2.size();
        }

        for(int i=0;i<arr1.length-1;i++){
            if(arr1[i]==arr2[i])
                answer++;
        }
        // for(int i=0;i<arr1.length-1;i++){
        //     System.out.println(arr1[i] + " " + arr2[i]);
        // }
        
        
        // for(int i:topping)
        //     hs.add(i);
        // for(int i=1;i<topping.length;i++){
        //     hs.clear();
        //     for(int j=0;j<i;j++){
        //         hs.add(topping[j]);
        //     }
        //     sum=hs.size();
        //     hs.clear();
        //     for(int j=i;j<topping.length;j++){
        //         hs.add(topping[j]);
        //     }
        //     if(hs.size()==sum){
        //         answer++;
        //     }
        // }
        return answer;
    }
}