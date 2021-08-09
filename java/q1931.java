import java.util.*;

public class q1931 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // 회의의 수
        int[][] arr = new int[N][2]; // [][0]: 시작시간, [][1]: 종료시간 
        int count = 0;
        int end = 0;
        for (int i=0;i<N;i++){
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }
        Arrays.sort(arr, (t1, t2) -> {
            if (t1[1]==t2[1]) return t1[0]-t2[0]; // 종료시간이 같으면 시작시간이 앞서는대로
            else return t1[1]-t2[1]; // 두 회의를 비교해서 종료시간이 앞서는 순서로 정렬
        });
        for (int i=0;i<N;i++){
            if (arr[i][0]>=end){
                count++;
                end = arr[i][1]; // 종료시간 갱신
            }
        }
        System.out.println(count);
    }
} 