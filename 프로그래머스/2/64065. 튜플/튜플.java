import java.util.*;
class Solution {
    public int[] solution(String s) {
        
        String[] arr = s.split("}");
        // String[] arr2 = new String[arr.length];
        HashSet<String> hs = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<2;j++){
                if(arr[i].charAt(0)=='{'||arr[i].charAt(0)==',')
                    arr[i]=arr[i].substring(1);
            }
        }
        Arrays.sort(arr, (x,y)->x.length()-y.length());
        // for(String i : arr)
        //     System.out.println(i);
        int[] answer = new int[arr.length];
        String[] x = {};
        int aa=0;
        for(int i=0;i<arr.length;i++){
            x = arr[i].split(",");
            for(int j=0;j<x.length;j++){
                if(!hs.contains(x[j])){
                    hs.add(x[j]);
                    answer[aa]=Integer.parseInt(x[j]);
                    aa++;
                }
            }
        }
        return answer;
    }
}