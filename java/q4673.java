import java.util.*;
import java.io.*;

public class q4673{
    static int endnum = 10000;
    static StringBuilder sb = new StringBuilder();
    static int find_dn(int n){
        int dn = n;
        while (n>0) {
            dn+=n%10; // 본래 수에서 1의자리 분해해서 계속 더함
            n/=10; // 낮은 자리수부터 하나씩 분해
        }
        return dn;
    }
    public static void main(String[] args) throws IOException{
        boolean[] dn_num = new boolean[endnum+1];
        for (int i=1;i<=endnum;i++){
            if (find_dn(i)<=endnum) dn_num[find_dn(i)] = true;
        } // d(n)값이 존재할 경우
        for (int i=1;i<=endnum;i++){
            if(!dn_num[i]) sb.append(i+"\n");
        }
        System.out.println(sb);
    }
}