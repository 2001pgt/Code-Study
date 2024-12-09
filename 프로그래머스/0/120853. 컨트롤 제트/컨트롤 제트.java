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