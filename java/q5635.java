import java.util.*;

public class q5635{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // 학생 수
        String[] name = new String[n];
        int[][] birth = new int[n][4]; // dd-mm-yyyy
        for (int i=0;i<n;i++){
            name[i] = in.next();
            birth[i][3] = i; // name과 연결하기 위해 정렬전 index 기록.
            for (int j=0;j<3;j++){
                birth[i][j] = in.nextInt();
            }
        } Arrays.sort(birth, (p1, p2) -> {
            if (p1[2]==p2[2]){
                if (p1[1]==p2[1]) return p1[0]-p2[0];
                else return p1[1]-p2[1];
            } else return p1[2]-p2[2];
        });
        System.out.println(name[birth[n-1][3]]+"\n"+name[birth[0][3]]);
    }
}