import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line);

        int n = st.countTokens();
        int[] P = new int[1001];
        int[] D = new int[1001];
        for (int i = 1; i <= n; i++) {
            P[i] = Integer.parseInt(st.nextToken());
        }
        D[1] = P[1];
        for (int i = 1; i <= N; i++) {
            int best = 0;
            for (int j = 1; j <= i; j++) {
                best = Math.max(best, P[j] + D[i - j]);
            }
            D[i] = best;
        }
        System.out.println(D[N]);
    }
}