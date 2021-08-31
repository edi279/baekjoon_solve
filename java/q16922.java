import java.util.*;

public class q16922{
    static int[] arr;
    static int[] rome = new int[] {1, 5, 10, 50};
    static boolean[] check;
    static int count = 0;
    static Map<Integer, Integer> map = new HashMap<>();
    static void count_num(int N, int index){
        int sum = 0;
        if (index>=N){
            for (int i=0;i<N;i++) sum+=arr[i];
            if (map.get(sum)==null) map.put(sum, count++); // 합이 중복되는 것 배제
            return;
        }
        for (int i=0;i<4;i++){
            if (!check[i]){
                for (int j=0;j<i;j++){
                    check[j] = true;
                } // 오름차순으로 선정, 자기 자신 중복 가능
                arr[index] = rome[i];
                count_num(N, index+1);
                for (int j=0;j<i;j++){
                    check[j] = false;
                }
            }
        }        
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // 숫자 수
        arr = new int[20]; // 1 ≤ N ≤ 20
        check = new boolean[20]; // 근데 N으로 하면 왜 오류나지? 
        count_num(N, 0);
        System.out.println(count);
    }
}
