import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 1) 빠른 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // 2) 배열로 직접 저장
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        // 3) 스택 기반 NGE (O(N))
        int[] nge = new int[N];
        Arrays.fill(nge, -1);
        Deque<Integer> stack = new ArrayDeque<>(N);

        for (int i = 0; i < N; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                nge[stack.pop()] = arr[i];
            }
            stack.push(i);
        }

        // 4) 빠른 출력
        StringBuilder sb = new StringBuilder(N * 3);
        for (int v : nge) {
            sb.append(v).append(' ');
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString().trim());
        bw.flush();
    }
}
