import java.util.*;

public class q1149{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        long[][] color = new long[N][3]; // 0:R, 1:G, 2:B
        for (int i=0;i<N;i++){
            for (int j=0;j<3;j++){
                color[i][j] = in.nextInt();
            }
        }
        for (int i=1;i<N;i++){
            for (int j=0;j<3;j++){
                if (j==0) color[i][j] += Math.min(color[i-1][1], color[i-1][2]); // Red
                if (j==1) color[i][j] += Math.min(color[i-1][0], color[i-1][2]); // Green
                if (j==2) color[i][j] += Math.min(color[i-1][0], color[i-1][1]); // Blue
            }
        } Arrays.sort(color[N-1]); // 최소비용
        System.out.println(color[N-1][0]);
    }
}