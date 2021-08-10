import java.util.*;

public class q1120 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String A = in.next();
        String B = in.next(); // 공백으로 구분
        int min = A.length();
        for(int i=0;i<=B.length()-A.length();i++){
            int count = 0;
            for (int j=0;j<A.length();j++){
                if (B.charAt(i+j)!=(A.charAt(j))) count++;
            }           // 낱개 글자 비교할때는 charAt() 
            if (min>count) min = count;
        }
        System.out.println(min);
    }
}
