import java.util.*;

public class q1038 {
    static ArrayList<Long> list;
    public static void candi_num(long num, int depth){
        if (depth>10) return; // 10자리 초과(9876543210)시 종료
        list.add(num);
        for (int i=0;i<10;i++){ // 앞자리보다 작은 수만 추가
            if (num%10>i) candi_num((num*10)+i, depth+1);
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        long result = 0; // 10자리의 경우 int 범위 초과
        list = new ArrayList<>();
        if (N<0 || N>1022) result = -1;
        else {
            for (int i=0;i<10;i++){
                candi_num(i, 0);
            }
            Collections.sort(list);
            result = list.get(N);
        }
        System.out.println(result);
    }
}