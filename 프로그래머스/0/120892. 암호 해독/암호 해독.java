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

// gpt가 만든 최적화 코드
class Solution {
    public String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder(); // StringBuilder 생성
        for (int i = code - 1; i < cipher.length(); i += code) {
            sb.append(cipher.charAt(i)); // code 간격의 문자 추가
        }
        return sb.toString(); // 결과 문자열 반환
    }
}

// Implementation	Average Time (s)
// StringBuilder	0.257
// String Concatenation	0.084
// Optimized Solution	0.034
// 위의 두 코드의 시간을 측정한 것이고 마지막은 gpt에서 최적화 시킨 코드의 시간이다
// 반복문 하나로 불필요한 부분을 줄이고 리턴할때도 값을 변수에넣지 않고 변환후 바로 리턴한다.
