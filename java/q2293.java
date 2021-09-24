import java.util.*;

public class q2293{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = in.nextInt();
        } Arrays.sort(arr);
        int[] dp = new int[k+1];
        dp[0] = 1; // 이전 값에서부터 더해오기 위해 초기값 설정.
        for (int i=0;i<n;i++){
            for (int j=arr[i];j<=k;j++){ // 동전이 존재하는 단위부터 시작
                dp[j]+=dp[j-arr[i]];
            }
        }
        System.out.println(dp[k]);
    }
}