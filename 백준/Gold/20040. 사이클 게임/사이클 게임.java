import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken()); // 점의 수
        int b = Integer.parseInt(st.nextToken()); // 선의 수
        int[][] arr = new int[b][2];

        // 간선 정보 입력받기
        for(int i = 0; i < b; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int[] ar = new int[a];
        Arrays.fill(ar,-1);
        ar[arr[0][0]]=arr[0][0];
        ar[arr[0][1]]=arr[0][0];
        int x=0;
        for(int i=1;i<b;i++){
            if(ar[arr[i][0]]==-1&&ar[arr[i][1]]==-1){
                ar[arr[i][0]]=arr[i][0];
                ar[arr[i][1]]=arr[i][0];
            }
            else if(ar[arr[i][0]]!=-1&&ar[arr[i][1]]!=-1){
                if(find(ar[arr[i][0]],ar)==find(ar[arr[i][1]],ar)){
                    System.out.println(i+1);
                    x=1;
                    break;
                }
                else{
                    ar[find(ar[arr[i][0]],ar)]=find(ar[arr[i][1]],ar);
                }
            }
            else if(ar[arr[i][0]]!=-1){
                ar[arr[i][1]]=ar[arr[i][0]];
            }
            else if(ar[arr[i][1]]!=-1){
                ar[arr[i][0]]=ar[arr[i][1]];
            }
        }
        if(x==0)
            System.out.println(0);

        // HashSet 리스트 생성
//        ArrayList<HashSet<Integer>> al = new ArrayList<>();
//
//        for(int i = 0; i < b; i++){
//            int u = arr[i][0];
//            int v = arr[i][1];
//
//            int setIndexU = -1, setIndexV = -1;
//
//            // u와 v가 각각 어느 집합에 속하는지 확인
//            for(int j = 0; j < al.size(); j++){
//                if(al.get(j).contains(u)) setIndexU = j;
//                if(al.get(j).contains(v)) setIndexV = j;
//            }
//
//            // u와 v가 모두 같은 집합에 있다면 사이클이 발생한 것
//            if(setIndexU != -1 && setIndexU == setIndexV){
//                System.out.println(i + 1);  // 처음 사이클이 생긴 간선의 번호 출력
//                return;
//            }
//
//            // u와 v가 각각 다른 집합에 있다면 두 집합을 합침
//            if(setIndexU != -1 && setIndexV != -1 && setIndexU != setIndexV){
//                al.get(setIndexU).addAll(al.get(setIndexV));  // 두 집합 병합
//                al.remove(setIndexV);  // 병합된 집합 삭제
//            }
//            // u만 속한 집합이 있을 경우 v를 그 집합에 추가
//            else if(setIndexU != -1){
//                al.get(setIndexU).add(v);
//            }
//            // v만 속한 집합이 있을 경우 u를 그 집합에 추가
//            else if(setIndexV != -1){
//                al.get(setIndexV).add(u);
//            }
//            // u와 v 모두 새로 등장한 점일 경우 새로운 집합을 생성
//            else{
//                HashSet<Integer> newSet = new HashSet<>();
//                newSet.add(u);
//                newSet.add(v);
//                al.add(newSet);
//            }
//        }
//
//        // 사이클이 없다면 0 출력
//        System.out.println(0);
    }

    static int find(int a,int[] arr){
        if(arr[a]==a){
            return a;
        }
        else return find(arr[a],arr);
    }

}