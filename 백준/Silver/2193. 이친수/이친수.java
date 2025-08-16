import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력
        int N = Integer.parseInt(br.readLine());
        // D 배열 선언
        long[][] D = new long[100][2];
        // 초기값 설정
        D[1][0] = 1;
        D[2][0] = 1;
        D[3][0] = 1;
        D[3][1] = 1;
        // 구현
        for(int n=4;n<=N;n++){
            D[n][1] = D[n-1][0];
            D[n][0] = D[n-1][0]+D[n-1][1];
        }
        System.out.println(D[N][1]+D[N][0]);
        // 아 D[1][0] = 0; 이라고 잘못적은걸 못봐서 틀렸네 ㅠ
    }
}