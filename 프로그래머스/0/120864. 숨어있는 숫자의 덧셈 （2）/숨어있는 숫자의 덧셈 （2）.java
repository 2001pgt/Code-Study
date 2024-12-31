class Solution {
    public static int solution(String my_string) {
        int answer = 0;

        int idx = 0;
        while (idx < my_string.length()) {
            int charNum = my_string.charAt(idx);

            // 숫자로 시작하는 부분 탐색
            if (charNum >= (int) '0' && charNum <= (int) '9') {
                int len = 1;

                // 계속 해서 숫자가 나오는지 확인
                if (idx + len < my_string.length()) {
                    while (my_string.charAt(idx + len) >= (int) '0'
                            && my_string.charAt(idx + len) <= (int) '9') {
                        len++;
                        if (idx + len == my_string.length()) {
                            break;
                        }
                    }
                }

                // 숫자로 변환, 덧셈
                answer += Integer.parseInt(my_string.substring(idx, idx + len));

                idx += len;
            }

            if (idx == my_string.length() - 1) {
                return answer;
            }
            idx++;
        }

        return answer;
    }
}