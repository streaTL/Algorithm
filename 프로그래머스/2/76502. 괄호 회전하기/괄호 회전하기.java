import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        String a=s;
        int x=1;
        int[] arr = new int[3];
        ArrayList<Integer> arr2 = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            a = a.substring(1)+a.charAt(0);
            // System.out.println(a);
            arr2.clear();
            arr[0]=0;
            arr[1]=0;
            arr[2]=0;
            for(int j=0;j<s.length();j++){
                if(a.charAt(j)=='('){
                        arr2.add((int)a.charAt(j));
                        arr[0]++;
                }
                else if(a.charAt(j)=='{'){
                        arr2.add((int)a.charAt(j));
                        arr[1]++;
                }
                else if(a.charAt(j)=='['){
                        arr2.add((int)a.charAt(j));
                        arr[2]++;
                }
                else if(a.charAt(j)==')'){
                    if(arr[0]==0){
                        break;
                    }
                    if(arr2.get(arr2.size()-1)=='('){
                        arr2.remove(arr2.size()-1);
                        arr[0]--;
                    }
                    else
                        break;
                }
                else if(a.charAt(j)=='}'){
                    if(arr[1]==0){
                        break;
                    }
                    if(arr2.get(arr2.size()-1)=='{'){
                        arr2.remove(arr2.size()-1);
                        arr[1]--;
                    }
                    else
                        break;
                }
                else if(a.charAt(j)==']'){
                    if(arr[2]==0){
                        break;
                    }
                    if(arr2.get(arr2.size()-1)=='['){
                        arr2.remove(arr2.size()-1);
                        arr[2]--;
                    }
                    else
                        break;
                }
                if(j==s.length()-1&&arr2.isEmpty())
                    answer++;
            }
        }
        // System.out.print(a);
        return answer;
    }
}