import java.util.*;
class Solution {
    static int[] arr;
    static boolean[] n = new boolean[10000000];
    static int res=0;
    static HashSet<Integer> hs = new HashSet<>();
    public int solution(String numbers) {
        int answer = 0;
        arr = new int[numbers.length()];
        for(int i=0;i<numbers.length();i++){
            arr[i]=numbers.charAt(i)-'0';
        }
        for(int i=2;i<10000;i++){
            int x=i*2;
            if(n[i])
                continue;
            while(x<10000000){
                n[x]=true;
                x+=i;
            }
        }
        n[0]=true;
        n[1]=true;
        boolean[] v = new boolean[numbers.length()];
        dfs(v,0,numbers.length(),0);
        return res;
    }
    public static void dfs(boolean[] v, int a, int b,int c){
        if(a==b)
            return;
        for(int i=0;i<b;i++){
            if(!v[i]){
                int x = c*10+arr[i];
                if(!hs.contains(x)){
                    hs.add(x);
                    if(!n[x])
                        res++;
                    // System.out.println(x);
                }
                v[i]=true;
                dfs(v,a+1,b,x);
                v[i]=false;
            }
        }
    }
}