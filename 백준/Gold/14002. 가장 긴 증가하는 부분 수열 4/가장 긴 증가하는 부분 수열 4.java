import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력
        int N = Integer.parseInt(br.readLine());
        String line = br.readLine(); // 한 줄 입력
        StringTokenizer st = new StringTokenizer(line, " ");

        int[] numbers = new int[st.countTokens()+1];
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        // D 배열 선언
        int[] D = new int[N+1];
        // 초기값 설정
        D[1] = 1;
        // 구현
        int maxLen = 1;
        for(int n=2;n<=N;n++){
            int max = 0;
            // D[n-1 이하]에서 가장 큰 값 찾기
            for(int i = 0;i<n;i++){
                if(numbers[i] < numbers[n] && D[i]>max){
                    max = D[i];
                }
            }
            D[n] = max+1;
            if(maxLen<D[n]){
                maxLen = D[n];
            }
        }
        // 완성 DP테이블을 활용하여 가장 긴 배열 찾기
        Deque<Integer> stack = new ArrayDeque<>();
        int currentLen = maxLen;
        for(int i=N;i>=1;i--){
            if(D[i] == currentLen){
                stack.push(numbers[i]);
                currentLen--;
            }
        }

        System.out.println(maxLen);
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
}