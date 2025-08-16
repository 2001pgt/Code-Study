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
//                System.out.println("n값은: "+n);
//                System.out.println("i값은: "+i);
//                System.out.println("D[i] = "+D[i]);
//                System.out.println("numbers[i] = "+numbers[i]);
                if(numbers[i] < numbers[n] && D[i]>max){
                    max = D[i];
                }
//                System.out.println("max: "+max);
            }
            D[n] = max+1;
//            System.out.println(D[n]);
            if(maxLen<D[n]){
                maxLen = D[n];
            }
        }
        System.out.println(maxLen);
        // 아 D[1][0] = 0; 이라고 잘못적은걸 못봐서 틀렸네 ㅠ
    }
}