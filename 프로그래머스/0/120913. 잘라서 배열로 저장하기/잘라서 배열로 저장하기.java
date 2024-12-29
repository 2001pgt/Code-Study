메모리: 86.6 MB, 시간: 11.42 ms
class Solution {
    public String[] solution(String my_str, int n) {
        // for문으로 문자열변수에 my_str[i] 문자를 추가
        // i가 n번 반복될 때 마다 문자열을 비우기
        // 만들어진 문자열을 문자열배열에 추가
        // 만약 문자가 남으면 그대로 추가후 종료
        String str = "";
        int size = my_str.length()%n == 0 ?  my_str.length()/n : my_str.length()/n+1;
        String[] strarr = new String[size];
        int index = 0;
        for(int i=0;i<my_str.length();i++)
        {
            str+=my_str.charAt(i);
            if(i == my_str.length()-1){
                strarr[index] = str;
            }
                
            else if((i+1) % n == 0)
            {
                strarr[index] = str;
                str = "";
                index++;
            }
        }
        return strarr;
    }
}
// str+=my_str.charAt(i);은 기존 문자열에 문자를 추가 하는 것이 아니라 새로운 문자열 객체를 만들기 때문에 연산비용이 커지고 GC의 부담이 증가함
// 그래서 StringBuilder를 사용하여 속도 개선
메모리: 82.2 MB, 시간: 0.06 ms
class Solution {
    public String[] solution(String my_str, int n) {
        StringBuilder sb = new StringBuilder();
        int size = (my_str.length() + n - 1) / n;
        String[] strarr = new String[size];
        int index = 0;
        for (int i = 0; i < my_str.length(); i++) {
            sb.append(my_str.charAt(i));
            if ((i + 1) % n == 0 || i == my_str.length() - 1) {
                strarr[index++] = sb.toString();
                sb.setLength(0); // StringBuilder 초기화
            }
        }
        return strarr;
    }
}

// 다른 풀이
// 아래는 substring을 활용하여 효율적으로 작성된 코드를 가져와 봤다.
// 배열을 필요한 만큼만 할당 후 배열 크기에 맞춰 substring을 사용하였다.
메모리: 77.4 MB, 시간: 0.03 ms
class Solution {
    public String[] solution(String my_str, int n) {
        int resultCnt = (my_str.length() + n - 1) / n;
        String[] answer = new String[resultCnt];

        for (int i = 0; i < resultCnt; i++) {
            int start = n * i;
            int end = start + n >= my_str.length()? my_str.length(): start + n;
            answer[i] = my_str.substring(start, end);
        }

        return answer;
    }
}
