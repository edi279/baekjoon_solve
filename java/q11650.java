import java.util.Scanner;
import java.util.Arrays;

public class q11650{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[][] arr = new int[N][2];

        for (int i=0;i<N;i++){
            arr[i][0] = in.nextInt(); // x좌표
            arr[i][1] = in.nextInt(); // y좌표
        }
        
        Arrays.sort(arr, (p1, p2) -> {
            if (p1[0]==p2[0]) return p1[1]-p2[1]; // 오름차순 리턴
            else return p1[0]-p2[0];
        }); // 람다식 사용

        for (int i=0;i<N;i++){
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }
}