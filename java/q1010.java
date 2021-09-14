import java.util.*;
import java.io.*;

public class q1010{ // N만큼 M의 지점을 순서없이 선택. 다리가 교차할 일 없음.
    public static void main(String[] args) throws IOException{
        StringBuilder sb = new StringBuilder();
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int[][] NM = new int[T][2]; // test case 입력
        long[] result = new long[T]; // 결과 출력
        for (int i=0;i<T;i++){
            NM[i][0] = in.nextInt(); // N
            NM[i][1] = in.nextInt(); // M
        }
        long[][] combi = new long[30][30];
        for (int i=0;i<30;i++){
            combi[i][0] = 1; // nⅭ₀ = 1
            combi[i][i] = 1; // nⅭn = 1
        }
        for (int i=1;i<30;i++){
            for (int j=1;j<i;j++){
                combi[i][j] = combi[i-1][j-1]+combi[i-1][j];
            } // nⅭr = n-₁Ⅽr-₁+n-₁Ⅽr
        }
        for (int i=0;i<T;i++){
            result[i] = combi[NM[i][1]][NM[i][0]];
            sb.append(result[i]+"\n");
        } System.out.print(sb);
    }
}