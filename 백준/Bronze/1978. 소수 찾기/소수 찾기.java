import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int cnt = 0;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (num <= 1) {
                continue;  // 1 이하는 소수가 아님
            }
            if (num == 2 || num == 3) {
                cnt++;    // 2와 3은 소수
                continue;
            }

            boolean isPrime = true;
            // 4 이상은 2부터 √num 까지만 검사
            for (int j = 2; j * j <= num; j++) {
                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
