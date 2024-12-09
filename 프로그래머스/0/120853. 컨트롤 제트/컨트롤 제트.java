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
