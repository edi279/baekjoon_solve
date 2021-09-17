import java.util.*;

public class q1463{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] dp = new int[N+1];
        for (int i=2;i<=N;i++){
            if (i%3==0&&i%2==0){ 
                dp[i] = Math.min(Math.min(dp[i/3]+1, dp[i/2]+1), dp[i-1]+1);
            } else if (i%3==0&&i%2!=0){ // ÷3
                dp[i] = Math.min(dp[i/3]+1, dp[i-1]+1);
            } else if (i%3!=0&&i%2==0){ // ÷2
                dp[i] = Math.min(dp[i/2]+1, dp[i-1]+1);
            } else { // -1
                dp[i] = dp[i-1]+1;
            } // -1 후에 연산한 단계가 더 적을 수 있으므로 min으로 비교.
        }
        System.out.println(dp[N]);
    }
}