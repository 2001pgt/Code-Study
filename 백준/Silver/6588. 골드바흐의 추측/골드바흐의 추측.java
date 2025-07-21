import java.io.*;
import java.util.*;

public class Main {
    static final int MAX = 1_000_000;
    static boolean[] isPrime = new boolean[MAX + 1];

    // 1. 체 생성
    static void sieve() {
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= MAX; i++) {
            if (!isPrime[i]) continue;
            for (int j = i * i; j <= MAX; j += i) {
                isPrime[j] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        sieve();  // 한 번 실행

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int N = Integer.parseInt(br.readLine());
            if (N == 0) break;

            // 2는 짝수 소수이지만 Goldbach 분해에서 양쪽 모두 홀수이므로 3부터 검사
            for (int a = 3; a <= N / 2; a += 2) {
                if (isPrime[a] && isPrime[N - a]) {
                    sb.append(N)
                      .append(" = ")
                      .append(a)
                      .append(" + ")
                      .append(N - a)
                      .append('\n');
                    break;
                }
            }
        }
        System.out.print(sb);
    }
}
