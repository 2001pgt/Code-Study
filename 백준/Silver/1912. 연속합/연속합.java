import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 첫 번째 숫자로 두 변수를 모두 초기화합니다.
        int firstNumber = Integer.parseInt(st.nextToken());
        int maxSoFar = firstNumber;      // 전체 최댓값 (지금까지 발견한 최댓값)
        int maxEndingHere = firstNumber; // 현재 위치에서 끝나는 구간의 최댓값
        
        // 두 번째 숫자부터 배열을 끝까지 순회합니다.
        for (int i = 1; i < N; i++) {
            int currentNum = Integer.parseInt(st.nextToken());
            
            // '현재 위치에서 끝나는 구간의 최댓값'을 계산합니다.
            // (이전까지의 합 + 현재 숫자) vs (현재 숫자부터 새로 시작)
            maxEndingHere = Math.max(maxEndingHere + currentNum, currentNum);
            
            // '전체 최댓값'을 업데이트합니다.
            // (기존의 전체 최댓값) vs (방금 구한 '현재 위치에서 끝나는 최댓값')
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        
        System.out.println(maxSoFar);
    }
}