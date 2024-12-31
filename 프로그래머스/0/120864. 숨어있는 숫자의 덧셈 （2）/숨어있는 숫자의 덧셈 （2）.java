class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int num = 0;

        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0'); // 숫자를 누적
            } else {
                answer += num; // 숫자 합산
                num = 0;       // 초기화
            }
        }

        // 마지막에 남아 있는 숫자를 더해줌
        answer += num;

        return answer;
    }
}