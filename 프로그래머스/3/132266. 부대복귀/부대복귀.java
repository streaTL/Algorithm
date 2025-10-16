import java.util.*;
class Solution {
    public int[] solution(int n, int[][] roads, int[] sources, int destination) {
        int[] answer = new int[sources.length];
        int[] arr = new int[n+1];
        Arrays.fill(arr,99999999);
        arr[destination]=0;
        ArrayList<ArrayList<Integer>> ar = new ArrayList<>();
        for(int i=0;i<=n;i++){
            ar.add(new ArrayList<>());
        }
        for(int i=0;i<roads.length;i++){
            ar.get(roads[i][0]).add(roads[i][1]);
            ar.get(roads[i][1]).add(roads[i][0]);
        }
        Queue<Integer> q = new LinkedList<>();
        q.add(destination);
        while(!q.isEmpty()){
            int x = q.poll();
            for(int i : ar.get(x)){
                if(arr[i]>arr[x]+1){
                    arr[i]=arr[x]+1;
                    q.add(i);
                }
            }
        }
        for(int i=0;i<sources.length;i++){
            if(arr[sources[i]]==99999999)
                answer[i]=-1;
            else answer[i]=arr[sources[i]];
        }
        return answer;
    }
}