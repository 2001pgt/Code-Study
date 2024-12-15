class Solution {
    public String solution(String cipher, int code) {
        
        // 반복문 돌려서 i+1이 code의 배수 일때 마다 i번째 문자 answer에 추가
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<cipher.length();i++)
        {
            if((i+1)%code == 0)
            {
                sb.append(cipher.charAt(i));
            }
        }
        String answer = sb.toString();
        return answer;
    }
}

// 다른 풀이
// substring 활
class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        // code의 크기만큼 건너뛰면서 반복문 실행
        for (int i = code; i <= cipher.length(); i = i + code) {
            answer += cipher.substring(i - 1, i); // i-1부터 i-1까지 자르기 때문에 i-1번째 문자를 잘라낸다는 의미
        }

        return answer;
    }
}
