import java.util.*;
import java.io.*;

public class q2108{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int avg = 0;
        int[] arr = new int[N];
        for (int i=0;i<N;i++){
            arr[i] = Integer.parseInt(br.readLine());
            avg+=arr[i];
        } 
        if (N==1) {
            for (int i=0;i<3;i++){
                sb.append(arr[0]+"\n");
            } sb.append(0);
            System.out.println(sb);
            return;
        }
        Arrays.sort(arr);
        /*최빈값 구하기*/
        int[][] count = new int[N][2];
        int check = arr[0];
        int j = 0;
        count[0][1] = arr[0];
        for (int i=0;i<N;i++){
            if (check!=arr[i]){
                check = arr[i];
                j++;
                count[j][0]++;
                count[j][1] = check; // 카운트할 숫자
            } else{
                count[j][0]++; // 카운트
            }
        } Arrays.sort(count, (num1, num2) -> {
            if (num1[0]==num2[0]) return num1[1]-num2[1];
            else return num2[0]-num1[0];
        });
        int lot;
        if (count[0][0]==count[1][0]) lot = count[1][1];
        else lot = count[0][1];
        /*평균 중앙값 범위*/
        avg = (int)Math.round((double)avg/N);
        int mid = arr[N/2];
        int range = arr[N-1]-arr[0];
        sb.append(avg+"\n"+mid+"\n"+lot+"\n"+range);
        System.out.println(sb);
    }
}