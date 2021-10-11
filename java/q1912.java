import java.util.*;

public class q1912 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n + 1];
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            dp[i] = Math.max(arr[i], dp[i - 1] + arr[i]);
        } // 현재 숫자와 더해간 값 중 더 큰 것 선택
        Arrays.sort(dp, 1, n + 1); // 수열의 수가 모두 음수일 수 있으므로 dp[0] 제외
        System.out.println(dp[n]);
    }
}