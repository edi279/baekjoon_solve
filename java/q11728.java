import java.util.*;
import java.io.*;

public class q11728{
    public static void main(String[] args) throws IOException{
        StringBuilder sb = new StringBuilder();
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int[] A = new int[N];
        int[] B = new int[M];
        int[] arr = new int[N+M];
        for (int i=0;i<N;i++){
            A[i] = in.nextInt();
        } Arrays.sort(A);
        for (int i=0;i<M;i++){
            B[i] = in.nextInt();
        } Arrays.sort(B);
        int i = 0;
        int j = 0;
        int k = 0;
        while (j<N&&k<M){
            if (A[j]>B[k]){
                arr[i] = B[k];
                k++;
            }
            else if (A[j]<=B[k]){
                arr[i] = A[j];
                j++;
            }
            i++;
        }
        while (j<N) arr[i++] = A[j++];
        while (k<M) arr[i++] = B[k++];
        for (int x=0;x<N+M;x++){
            sb.append(arr[x]+" "); // 시간제한땜에 씀
        }
        System.out.println(sb);
    }
}