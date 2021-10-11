import java.util.*;

public class q16173 {
    static int N;
    static int[][] map;

    static void dfs(int start, int right, int down) {
        if (start == -1) {
            System.out.println("HaruHaru");
            System.exit(0); // 도착하면 게임종료
        }
        if (start == 0)
            return; // 0일경우 진행불가
        if (right + start < N) {
            dfs(map[right + start][down], right + start, down);
        } // 가로 진행 탐색
        if (down + start < N) {
            dfs(map[right][down + start], right, down + start);
        } // 하방 진행 탐색
          // else if를 사용하면 양방향 모두 탐색이 불가함.
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        map = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = in.nextInt();
            }
        }
        dfs(map[0][0], 0, 0);
        System.out.println("Hing"); // 도착을 못한 경우
    }
}