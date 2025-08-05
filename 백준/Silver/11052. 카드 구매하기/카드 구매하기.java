import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력
        int N = Integer.parseInt(br.readLine());
        // 문자열로 입력받고
        String line = br.readLine();
        // StringTokenizer를 이용해 입력받은 문자열을 배열에 하나씩 넣는작업
        StringTokenizer st = new StringTokenizer(line);
        int n = st.countTokens();
        // P 배열선언
        int[] P = new int[1001];
        for (int i = 1; i <= n; i++) {
            P[i] = Integer.parseInt(st.nextToken());
        }
        // D 배열 선언
        int[] D = new int[1001];
        // 초기값 설정
        D[1] = P[1];
        // 바텀업 방식을 이용해 최적값 탐색
        for (int i = 1; i <= N; i++) {
            int best = 0;
            for (int j = 1; j <= i; j++) {
                best = Math.max(best, P[j] + D[i - j]);
            }
            D[i] = best;
        }
        // 출력
        System.out.println(D[N]);
        // 후기 DP 이전에 풀어던 dp문제와 다르게 규칙을 발견하고 그것을 바탕으로
        // 점화식을 세우기가 힘들었다.
        // 바텀업이라는 방식을 알게되었다.
    }
}