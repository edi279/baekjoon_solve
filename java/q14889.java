import java.io.*;
import java.util.*;

public class q14889{
    static int N;
    static int[][] S;
    static boolean[] team; // true는 start, false는 link
    static int min = 201;
    public static void cal_min(){
        int start = 0;
        int link = 0;
        for (int i=0;i<N-1;i++){
            for (int j=i+1;j<N;j++){
                if (team[i]&&team[j]){ // start
                    start += S[i][j] + S[j][i];
                } else if (!team[i]&&!team[j]){ // link
                    link += S[i][j] + S[j][i];
                }
            }
        }
        int cal_min = Math.abs(start-link); // 뺀 절댓값
        if (cal_min==0){
            min = 0;
            return;
        }
        min = Math.min(min, cal_min);
    }
    public static void find_min(int count, int index){
        if (count==N/2){ // 두 팀이므로 인원수의 절반 선택
            cal_min();
            return;
        }
        for (int i=index;i<N;i++){
            if (!team[i]){
                team[i] = true; // start를 기준으로 선정
                find_min(count+1, i+1);
                team[i] = false; // 초기화
            }
            /*
            if(!check[i]){
                check[i] = true;
                arr[index] = i+1; // 2차원 배열로 따지면 count에 값이 들어갔으니까 +1 된것. (count, index)에서 count 먼저 +1하고
                backtracking(N, M, index+1); // 여기서 index도 +1 해줌.(근데 index+1은 시간 넘 오래걸려서 i+1)
                check[i] = false;
            }
            */
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = new int[N][N];
        team = new boolean[N];
        for (int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for (int j=0;j<N;j++){
                S[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        find_min(0, 0);
        System.out.println(min);
    }
}