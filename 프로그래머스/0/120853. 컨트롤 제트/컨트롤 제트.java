class Solution {
    public int solution(String s) {
        int answer = 0;
        String buffer = "";
        int number = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (currentChar == ' ') {
                // 공백인 경우: buffer를 숫자로 변환하고 answer에 더하기
                if (!buffer.isEmpty()) {
                    number = Integer.parseInt(buffer);
                    answer += number;
                    buffer = "";
                }
            } else if (currentChar == 'Z') {
                // Z인 경우: 바로 이전에 추가한 숫자를 빼기
                answer -= number;
                buffer = ""; // buffer는 비워줌
            } else {
                // 숫자인 경우: buffer에 추가
                buffer += currentChar;
            }
        }

        // 마지막 숫자 처리
        if (!buffer.isEmpty()) {
            number = Integer.parseInt(buffer);
            answer += number;
        }

        return answer;
    }
}
// 다른 풀이
// 뭔가 스택을 쓰면 더쉽게 풀수있을거 같아서 풀어봤더니 엄청간단하게 풀린다.
// 속도도 0ms 대가 나오며 10배 가까이 빨라짐
import java.util.Stack;

class Solution {
    public int solution(String s) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = s.split(" ");

        for (String token : tokens) {
            if (token.equals("Z")) {
                // Z인 경우: 스택에서 마지막 숫자를 제거
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                // 숫자인 경우: 스택에 추가
                stack.push(Integer.parseInt(token));
            }
        }

        // 스택에 남아 있는 모든 숫자를 합산
        int answer = 0;
        for (int num : stack) {
            answer += num;
        }

        return answer;
    }
}
