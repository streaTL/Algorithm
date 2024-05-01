import java.util.Arrays;
class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        int[][] arr = new int[triangle.length][triangle.length];
        arr[0][0]=triangle[0][0];
        
        for(int i=0;i<triangle.length-1;i++){
            for(int j=0;j<triangle[i].length;j++){
                if(arr[i][j]+triangle[i+1][j]>arr[i+1][j])
                    arr[i+1][j]=arr[i][j]+triangle[i+1][j];
                if(arr[i][j]+triangle[i+1][j+1]>arr[i+1][j+1])
                    arr[i+1][j+1]=arr[i][j]+triangle[i+1][j+1];
            }
        }
        
        // Arrays.sort(triangle[triangle.length-1]);
        Arrays.sort(arr[triangle.length-1]);
        // for(int i=0;i<triangle.length;i++){
        //     for(int j=0;j<triangle[i].length;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        answer = arr[triangle.length-1][triangle.length-1];
        return answer;
    }
}