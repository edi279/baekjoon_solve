import java.util.*;
import java.io.*;

public class q18870{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String[] x = br.readLine().split(" ");
        int[] X = new int[N];
        for (int i=0;i<N;i++){
            X[i] = Integer.parseInt(x[i]);
        }
        int[] sort_X = X.clone();
        Arrays.sort(sort_X);
        Map<Integer, Integer> map = new HashMap<>(); // 겹치는 수 카운트 안하려고
        int index = 0;
        for (int i=0;i<N;i++){
            if (map.get(sort_X[i])==null) map.put(sort_X[i], index++);
        } // 정렬된 배열의 숫자가 아직 없으면 넣고 인덱스 이동.
        for (int i=0;i<N;i++){
            sb.append(map.get(X[i])+" "); // 정렬후 인덱스를 정렬전 배열의 값에 불러옴
        } System.out.println(sb);
    }
}
