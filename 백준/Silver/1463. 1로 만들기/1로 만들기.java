import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        // dp[i] = i를 1로 만드는 최소 연산 횟수, 동시에 방문 체크 역할
        int[] dp = new int[N + 1];
        Arrays.fill(dp, -1);
        
        Deque<Integer> q = new ArrayDeque<>();
        q.add(N);
        dp[N] = 0;  // 시작점
        
        while (!q.isEmpty()) {
            int x = q.poll();
            int cnt = dp[x];
            
            if (x == 1) {
                System.out.println(cnt);
                return;
            }
            
            // 세 가지 연산 후보
            int[] nexts = { x - 1, (x % 2 == 0 ? x / 2 : -1), (x % 3 == 0 ? x / 3 : -1) };
            for (int nx : nexts) {
                if (nx >= 1 && dp[nx] == -1) {
                    dp[nx] = cnt + 1;
                    q.add(nx);
                }
            }
        }
    }
}
