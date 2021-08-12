import java.util.*;

public class q1535 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // 사람 수
        int[] L = new int[N]; // 체력
        int[] J = new int[N]; // 기쁨
        int[] dp = new int[100]; // 잔여 에너지 (dp 사용)
        for (int i=0;i<N;i++){
            L[i] = in.nextInt();
        }
        for (int i=0;i<N;i++){
            J[i] = in.nextInt();
        }
        for (int i=0;i<N;i++){
            for (int j=99;j>=0;j--){
                int energy = L[i]+j;
                if (energy<100){
                    dp[energy] = Math.max(dp[energy], dp[j]+J[i]);
                    /*i=0 L:1 j<=98 J:20 // dp[99]~dp[1]까지 20 채움
                      i=1 L:79 j<=20 J:25 // 99~79까지 20+25, 그 밑은 20
                      i=2 L:21 j=78 J:30 // 99~79 20+25?20+30, 20~ 20
                      i=3 L:42 j=57 J:20 // 99~79 50?50+20
                      i=4 L:10 j=89 J=5 // 99~89 70?70+5*/
                }
            }
        }
        System.out.println(dp[99]);
    }
}