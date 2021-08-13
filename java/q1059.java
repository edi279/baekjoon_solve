import java.util.*;

public class q1059 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int L = in.nextInt(); // 집합 S의 크기
        int[] S = new int[L];
        for (int i=0;i<L;i++){
            S[i] = in.nextInt();
        } Arrays.sort(S);
        int n = in.nextInt();
        int count = 0;
        int min = 0;
        int max = 1001;
        for (int i=0;i<L;i++){
            if (S[i]<n) min = S[i];
            else if (S[i]>n) {
                if (S[i]<max) { // 이거 왜 and로 묶으면 안될까?
                    max = S[i];
                }
            } else {
                System.out.println(0);
                return;
            }
            if (min!=0&&max!=1001) break;
        }
        for (int i=min+1;i<=n;i++){ // n 앞부분
            for (int j=n;j<max;j++) { // n 뒷부분
                if (i==j) continue; // 시작과 끝이 모두 n인 경우 제외.
                count++;
            }
        }
        System.out.println(count);
    }
}