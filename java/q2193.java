import java.util.*;

public class q2193{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        long[][] arr = new long[N][2]; // 열의 경우 0, 1이 오는지 여부
        arr[0][0] = 0; // 첫자리에 올 수 있는 경우로 0은 없음.
        arr[0][1] = 1; // 첫자리는 1 -> 1이 1개임을 기록.
        for (int i=1;i<N;i++){
            for (int j=0;j<2;j++){
                if (j==0) arr[i][j] = arr[i-1][0]+arr[i-1][1]; // 0과 1 모두 올 수 있다.
                else arr[i][j] += arr[i-1][0]; // 1이면 그 전 자릿수는 0 
            }
        }
        arr[N-1][1]+=arr[N-1][0];
        System.out.println(arr[N-1][1]);
    }
}