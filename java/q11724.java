import java.util.*;

public class q11724 {
    static boolean[] check;
    static ArrayList<Integer>[] list;
    static int count = 0;

    static void dfs(int v) {
        if (check[v])
            return;
        check[v] = true;
        for (int i : list[v]) {
            if (!list[i].isEmpty() && !check[i])
                dfs(i);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // 정점 개수
        long M = in.nextLong(); // 간선 개수
        list = new ArrayList[N + 1];
        check = new boolean[N + 1];
        for (int i = 1; i <= N; i++) {
            list[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < M; i++) {
            int u = in.nextInt();
            int v = in.nextInt();
            list[u].add(v);
            list[v].add(u);
        }
        for (int i = 1; i <= N; i++) {
            if (!check[i]) { // 여기에 !isEmpty()를 조건으로 넣으면
                dfs(i); // 간선(M)이 0개일때 카운트를 못함.
                count++;
            }
        }
        System.out.println(count);
    }
}