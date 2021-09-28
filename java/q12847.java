import java.util.*;

public class q12847{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // 마감일
        int m = in.nextInt(); // 일할수 있는날
        int[] T = new int[n+1];
        long[] addT = new long[n+1]; // 최대 100만 단위의 누적합이므로 int는 초과가능성.
        for (int i=1;i<=n;i++){
            T[i] = in.nextInt();
            addT[i] = T[i];
        }
        for (int i=1;i<=n;i++){
            addT[i] += addT[i-1];
            if (i>m) addT[i] -= T[i-m];
        }
        Arrays.sort(addT);
        System.out.println(addT[n]);
    }
}