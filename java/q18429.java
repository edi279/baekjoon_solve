import java.util.*;

public class q18429{
    static int[] arr;
    static int[] sort;
    static boolean[] check;
    static int count = 0;
    static void program(int N, int K, int index){
        int sum = 0;
        if(index>=N){
            for (int i=0;i<N;i++){
                sum += sort[i];
                if (sum<0) return; // 한번이라도 음수가 되면 제외
            } count++;
            return;
        }
        for (int i=0;i<N;i++){
            if (!check[i]){
                check[i] = true;
                sort[index] = arr[i];
                program(N, K, index+1);
                check[i] = false;
            }
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // 운동기간
        int K = in.nextInt(); // 감소되는 중량
        arr = new int[N];
        sort = new int[N];
        check = new boolean[N];
        for (int i=0;i<N;i++){
            arr[i] = in.nextInt();
            arr[i]-=K; // 앞선 일자의 합이 음수가 되는지 체크하기 위해
        } Arrays.sort(arr);
        program(N, K, 0);
        System.out.println(count);
    }
}