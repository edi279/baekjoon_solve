import java.util.*;

public class q2670{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        double[] arr = new double[N+1];
        for (int i=1;i<=N;i++){
            arr[i] = in.nextDouble();
        }
        for (int i=1;i<=N;i++){
            arr[i] = Math.max(arr[i], arr[i-1]*arr[i]); 
            // 연속한 두 수의 곱이 더 크면 값 갱신, 아니면 그대로
            // 계속 커지면 계속 갱신되지만, 단일 숫자가 더 크거나 값이 작아지면 갱신x
        } Arrays.sort(arr); // 연산된 수를 정렬하여 최대값 도출.
        System.out.println(String.format("%.3f", arr[N]));
    }
}