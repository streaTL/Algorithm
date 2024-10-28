import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<7;i++){
            st= new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a==1){
                if(b>19)
                    hs.add(1);
                else hs.add(12);
            }
            else if(a==2){
                if(b>18)
                    hs.add(2);
                else hs.add(1);
            }
            else if(a==3){
                if(b>20)
                    hs.add(3);
                else hs.add(2);
            }
            else if(a==4){
                if(b>19)
                    hs.add(4);
                else hs.add(3);
            }
            else if(a==5){
                if(b>20)
                    hs.add(5);
                else hs.add(4);
            }
            else if(a==6){
                if(b>21)
                    hs.add(6);
                else hs.add(5);
            }
            else if(a==7){
                if(b>22)
                    hs.add(7);
                else hs.add(6);
            }
            else if(a==8){
                if(b>22)
                    hs.add(8);
                else hs.add(7);
            }
            else if(a==9){
                if(b>22)
                    hs.add(9);
                else hs.add(8);
            }
            else if(a==10){
                if(b>22)
                    hs.add(10);
                else hs.add(9);
            }
            else if(a==11){
                if(b>22)
                    hs.add(11);
                else hs.add(10);
            }
            else if(a==12){
                if(b>21)
                    hs.add(12);
                else hs.add(11);
            }
        }

        st=new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        int[][] arr = new int[c][2];
        int res=0;
        for(int i=0;i<c;i++){
            st= new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[i][0]=a;
            arr[i][1]=b;
        }
        Arrays.sort(arr,(x,y)->x[0]==y[0]?x[1]-y[1]:x[0]-y[0]);
        for(int i=0;i<c;i++){
            if(arr[i][0]==1){
                if(arr[i][1]>19){
                    if(!hs.contains(1)){
                        sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
                        res++;
                    }
                }
                else{
                    if(!hs.contains(12)){
                        sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
                        res++;
                    }
                }
            }
            else if(arr[i][0]==2){
                if(arr[i][1]>18){
                    if(!hs.contains(2)){
                        sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
                        res++;
                    }
                }
                else{
                    if(!hs.contains(1)){
                        sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
                        res++;
                    }
                }
            }
            else if(arr[i][0]==3){
                if(arr[i][1]>20){
                    if(!hs.contains(3)){
                        sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
                        res++;
                    }
                }
                else{
                    if(!hs.contains(2)){
                        sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
                        res++;
                    }
                }
            }
            else if(arr[i][0]==4){
                if(arr[i][1]>19){
                    if(!hs.contains(4)){
                        sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
                        res++;
                    }
                }
                else{
                    if(!hs.contains(3)){
                        sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
                        res++;
                    }
                }
            }
            else if(arr[i][0]==5){
                if(arr[i][1]>20){
                    if(!hs.contains(5)){
                        sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
                        res++;
                    }
                }
                else{
                    if(!hs.contains(4)){
                        sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
                        res++;
                    }
                }
            }
            else if(arr[i][0]==6){
                if(arr[i][1]>21){
                    if(!hs.contains(6)){
                        sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
                        res++;
                    }
                }
                else{
                    if(!hs.contains(5)){
                        sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
                        res++;
                    }
                }
            }
            else if(arr[i][0]==7){
                if(arr[i][1]>22){
                    if(!hs.contains(7)){
                        sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
                        res++;
                    }
                }
                else{
                    if(!hs.contains(6)){
                        sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
                        res++;
                    }
                }
            }
            else if(arr[i][0]==8){
                if(arr[i][1]>22){
                    if(!hs.contains(8)){
                        sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
                        res++;
                    }
                }
                else{
                    if(!hs.contains(7)){
                        sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
                        res++;
                    }
                }
            }
            else if(arr[i][0]==9){
                if(arr[i][1]>22){
                    if(!hs.contains(9)){
                        sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
                        res++;
                    }
                }
                else{
                    if(!hs.contains(8)){
                        sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
                        res++;
                    }
                }
            }
            else if(arr[i][0]==10){
                if(arr[i][1]>22){
                    if(!hs.contains(10)){
                        sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
                        res++;
                    }
                }
                else{
                    if(!hs.contains(9)){
                        sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
                        res++;
                    }
                }
            }
            else if(arr[i][0]==11){
                if(arr[i][1]>22){
                    if(!hs.contains(11)){
                        sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
                        res++;
                    }
                }
                else{
                    if(!hs.contains(10)){
                        sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
                        res++;
                    }
                }
            }
            else if(arr[i][0]==12){
                if(arr[i][1]>21){
                    if(!hs.contains(12)){
                        sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
                        res++;
                    }
                }
                else{
                    if(!hs.contains(11)){
                        sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
                        res++;
                    }
                }
            }
        }
        if(res!=0)
            System.out.println(sb);
        else System.out.println("ALL FAILED");
    }
}
