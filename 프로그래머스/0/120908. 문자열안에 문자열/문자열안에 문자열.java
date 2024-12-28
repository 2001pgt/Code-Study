class Solution {
    public int solution(String str1, String str2) {
        // StringBuilder에 str1을 저장 후 str2문자열 탐색
        // 탐색된 인덱스를 저장하는 변수가 -1이 아니면 1,-1이면 2
        StringBuilder sb = new StringBuilder(str1);
        int index = sb.indexOf(str2);
        if(index != -1)
            return 1; 
        else
            return 2;
    }
}
// 다른 풀이
// 메서드 사용하지 않고 직접 구현하기
class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;

        boolean result = false;
        for (int i = 0; i < str1.length(); i++) {
            char chr = str1.charAt(i);

            if (chr == str2.charAt(0)) {
                int len = i + str2.length();
                String str = (len < str1.length() ? str1.substring(i, len) : str1.substring(i));

                if (str.equals(str2)) { result = true; break; }
            }
        }

        if (result) answer = 1; 
        else answer = 2;

        return answer;
    }
}
