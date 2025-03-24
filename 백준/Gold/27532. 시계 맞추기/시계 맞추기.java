import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        //시간->분
        int[] times = new int[M];
        for (int i = 0; i < M; i++) {
            String time = sc.next();
            String[] parts = time.split(":");
            int HH = Integer.parseInt(parts[0]);
            int MM = Integer.parseInt(parts[1]);
            if(HH == 12) HH = 0;  // 12시는 0으로 취급
            times[i] = HH * 60 + MM;
        }

        int ans = M;  //최악=M

        // 시간최대=720
        for (int R = 0; R < 720; R++) {
            Set<Integer> distinct = new HashSet<>();
            for (int i = 0; i < M; i++) {
                int index = i + 1; // 첫값도 R분 후 본거임
                // 음수 커지는거 방지=%720
                int adjusted = ((times[i] - index * R) % 720);
                if(adjusted < 0) adjusted += 720;
                distinct.add(adjusted);
            }
            ans = Math.min(ans, distinct.size());
        }

        System.out.println(ans);
    }
}