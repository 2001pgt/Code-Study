import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력
        int T = Integer.parseInt(br.readLine());
        // D 배열 선언
        int[][] D = new int[100001][4];
        // 초기값 설정
        D[1][1] = 1;
        D[2][2] = 1;
        D[3][1] = 1;
        D[3][2] = 1;
        D[3][3] = 1;
        // 구현
        for(int n=4;n<=100000;n++){
            D[n][1] = (D[n-1][2]+D[n-1][3])%1000000009;
            D[n][2] = (D[n-2][1]+D[n-2][3])%1000000009;
            D[n][3] = (D[n-3][2]+D[n-3][1])%1000000009;
        }
        for(int t=0;t<T;t++){
            int N = Integer.parseInt(br.readLine());
            long sum = (long)D[N][1] + D[N][2] + D[N][3];
            System.out.println(sum%1000000009);
        }
    }
}