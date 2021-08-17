import java.util.*;

public class q2693{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int[][]arr = new int[T][10];
        for (int i=0;i<T;i++){
            for (int j=0;j<10;j++){
                arr[i][j] = in.nextInt();
            }
        }
        for (int i=0;i<T;i++){
            Arrays.sort(arr[i]);
        }
        for (int i=0;i<T;i++){
            System.out.println(arr[i][7]); // 각 배열에서 3번째 큰 수
        }
    }
}