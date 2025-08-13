import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int mod = 1000000000;
        // 입력
        int N = Integer.parseInt(br.readLine());
        // D 배열 선언
        long[][] D = new long[101][101];
        // 초기값 설정
        D[1][0] = 0;
        for(int i=1;i<=9;i++){
            D[1][i] = 1;
        }
        // 구현
        for(int y=2;y<=N;y++){
            for(int x = 0;x<=9;x++){
                if(x == 0){
                    D[y][x] = D[y-1][1]% mod;
                    continue;
                }
                else if (x == 9) {
                    D[y][x] = D[y-1][8]% mod;
                    continue;
                }
                D[y][x] = (D[y-1][x+1] + D[y-1][x-1])% mod;
            }
        }
        long sum = 0;
        for(int i=0;i<=9;i++){
            sum += (D[N][i])%mod;
        }
        System.out.println(sum%mod);

    }
    // dp 너무 어렵다 ㅠㅠ
}