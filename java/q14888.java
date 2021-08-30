import java.util.*;
import java.io.*;

public class q14888{
    static int N;
    static int[] A;
    static int[] cal = new int[4]; // 순서대로 덧셈, 뺄셈, 곱셈, 나눗셈
    static long max = Integer.MIN_VALUE;
    static long min = Integer.MAX_VALUE;
    static void result(int num, int index){
        if (index>=N){
            max = Math.max(max, num);
            min = Math.min(min, num);
            return;
        }
        for (int i=0;i<4;i++){
            if (cal[i]>0){
                cal[i]--; // 재귀호출 시작
                if (i==0){ // +
                    result(num+A[index], index+1);
                } else if (i==1){ // -
                    result(num-A[index], index+1);
                } else if (i==2){ // x
                    result(num*A[index], index+1);
                } else if (i==3){ // ÷
                    result(num/A[index], index+1);
                }
                cal[i]++; // 재귀호출 종료
            }
        }
    }
    public static void main(String[] args) throws IOException{
        StringBuilder sb = new StringBuilder();
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        A = new int[N];
        for (int i=0;i<N;i++){
            A[i] = in.nextInt();
        }
        for (int i=0;i<4;i++){
            cal[i] = in.nextInt();
        }
        result(A[0], 1);
        sb.append(max+"\n"+min);
        System.out.println(sb);
    }
}