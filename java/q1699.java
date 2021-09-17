import java.util.*;

public class q1699{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] dp = new int[N+1];
        for (int i=1;i<=N;i++){
            dp[i] = i; // 최대값으로 초기화
            for (int j=1;j*j<=i;j++){
                dp[i] = Math.min(dp[i-j*j]+1, dp[i]);
            } // 본래 수보다 작은 제곱수들을 빼가며 작은 수 선택
        }     // 본래 수에 근접한 가장 큰 제곱수가 포함된 값이 꼭 최소 개수는 아님.
              // 대표적 반례: N=12 (9+1+1+1)vs(4+4+4)
        System.out.println(dp[N]);
    }
}