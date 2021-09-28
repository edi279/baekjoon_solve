import java.util.*;

public class q8394{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int max = 10000001;
        int n = in.nextInt();
        int[] dp = new int[max];
        dp[1] = 0;
        dp[2] = 2;
        dp[3] = 3;
        for (int i=4;i<=n;i++){ // 점화식
            dp[i] = (dp[i-1] + dp[i-2]) % 10; 
        }
        System.out.println(dp[n]);
    }
}