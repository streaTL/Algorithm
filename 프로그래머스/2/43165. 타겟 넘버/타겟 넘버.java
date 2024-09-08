class Solution {
    static int answer = 0;
    // static int x = 0;
    public int solution(int[] numbers, int target) {
        // x=targe
        dfs(numbers,0,0,0,target);
        
        return answer;
    }
    
    public static void dfs(int[] numbers,int a, int b, int c,int target){
        
        if(b==numbers.length){
            if(a==target)
                answer++;
            return;
        }
            dfs(numbers,a+numbers[c],b+1,c+1,target);
            dfs(numbers,a-numbers[c],b+1,c+1,target);
    }
    
}