import java.util.*;

public class q1946{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt(); // test case
        int[] max = new int[T];
        for (int k=0;k<T;k++){
            int N = in.nextInt(); // 지원자 수
            int[] second = new int[N]; // 인덱스를 서류, 배열값을 면접으로 설정.
            int count = N;
            int toprank = N;
            for (int i=0;i<N;i++){ 
                int first = in.nextInt(); // 인덱스를 통해 서류는 이미 정렬되므로
                second[first-1] = in.nextInt(); // // 2차원 배열보다 시간 단축
            }
            for (int i=0;i<N;i++){
                if (toprank>=second[i]){
                    toprank = second[i];
                } else count--;
            } max[k] = count;
        }
        for (int k=0;k<T;k++){
            System.out.println(max[k]);
        }
    }
}