class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int sum;
        int[] arr = new int[number.length]; 
        for(int i=0;i<discount.length-9;i++){
            sum=0;
            for(int j=0;j<number.length;j++){
                arr[j]=0;
            }
            for(int k=0;k<10;k++){
                for(int j=0;j<want.length;j++){
                    if(discount[i+k].equals(want[j])){
                    arr[j]++;
                    }
                }
            }
            for(int j=0;j<number.length;j++){
                // System.out.print(arr[j]);
                if(number[j]==arr[j])
                    sum++;
            }
            // System.out.println();
            if(sum==number.length)
                answer++;
        }
        return answer;
    }
}