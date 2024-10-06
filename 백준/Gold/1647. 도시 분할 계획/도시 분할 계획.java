import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        PriorityQueue<int[]> pq = new PriorityQueue<>((x,y)->x[2]-y[2]);
        int[] arr2 = new int[a+1];
        for(int i=0;i<b;i++){
            int[] xx = new int[3];
            xx[0]=sc.nextInt();
            xx[1]=sc.nextInt();
            xx[2]=sc.nextInt();
            pq.add(xx);
        }
        for(int i=1;i<a+1;i++){
            arr2[i]=i;
        }
        int res=0;
        int w=0;
        int sum=0;

        for(int i=0;i<b;i++){
            if(arr2[pq.peek()[0]]==0&&arr2[pq.peek()[1]]==0){
                arr2[pq.peek()[0]]=pq.peek()[1];
                arr2[pq.peek()[1]]=pq.peek()[1];
                res+=pq.peek()[2];
                w=pq.peek()[2];
                sum++;
            }
            else if(arr2[pq.peek()[0]]==0){
                arr2[pq.peek()[0]]=arr2[pq.peek()[1]];
                res+=pq.peek()[2];
                w=pq.peek()[2];
                sum++;
            }
            else if(arr2[pq.peek()[1]]==0){
                arr2[pq.peek()[1]]=arr2[pq.peek()[0]];
                res+=pq.peek()[2];
                w=pq.peek()[2];
                sum++;
            }
            else{
                if(find(pq.peek()[0],arr2)!=find(pq.peek()[1],arr2)){
                    arr2[find(pq.peek()[0],arr2)]=arr2[find(pq.peek()[1],arr2)];
                    res+=pq.peek()[2];
                    w=pq.peek()[2];
                    sum++;
                }
            }
            if(sum==a-1)
                break;
            pq.poll();
        }
        System.out.println(res-w);
    }

    static int find(int a, int[] arr){

        if(arr[a]==a)
            return a;
        return arr[a]=find(arr[a],arr);
    }

}
