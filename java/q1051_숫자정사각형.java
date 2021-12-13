import java.util.*;

public class q1051 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int[][] rec = new int[N][M];
        int min = Math.min(N, M);
        int square = 1;
        int max_square = 1;
        for (int i=0;i<N;i++){
            String row = in.next();
            for (int j=0;j<M;j++){
                rec[i][j] = row.charAt(j)-'0'; // 문자를 숫자로
            }
        }
        for (int k=0;k<min;k++){
            for (int i=0;i+k<N;i++){
                for (int j=0;j+k<M;j++){
                    if ((rec[i][j]==rec[i+k][j+k])&&(rec[i+k][j]==rec[i][j+k])&&(rec[i][j]==rec[i+k][j])){
                        square = (k+1)*(k+1);
                        max_square = Math.max(max_square, square);
                    }
                }
            }
        }
        System.out.println(max_square);
    }
}
