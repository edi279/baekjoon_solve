import java.util.*;

public class q2606 {
    static ArrayList<Integer>[] list;
    static boolean[] check;
    static int count = 0;

    static void virus(int v) {
        if (check[v])
            return;
        check[v] = true;
        count++;
        for (int i : list[v]) {
            if (!check[i]) // 점검하지 않은 컴퓨터면
                virus(i); // 연결된 컴퓨터들 탐색
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int pair = in.nextInt();
        check = new boolean[N + 1]; // 연결된 컴퓨터를 체크했는지 표시
        list = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            list[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < pair; i++) {
            int v1 = in.nextInt();
            int v2 = in.nextInt();
            list[v1].add(v2);
            list[v2].add(v1);
        }
        virus(1); // 1번을 통해 감염된 컴퓨터 찾기
        System.out.println(count - 1); // 1번 컴퓨터 제외
    }
}