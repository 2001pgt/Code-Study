메모리: 76.4 MB, 시간: 0.09 ms
class Solution {
    public int solution(String my_string) {
        // 자연수가 없는경우 0 리턴
        // 스트링빌더 객체 생성
        // 숫자면 객체에 append
        // 객체안 숫자가 공백이 아니라면 객체안에 숫자들을 정수로 변환해서 결과에 더한다
        // 만약 "" 이면 continue
        StringBuilder sb = new StringBuilder();
        int answer = 0;
        if(my_string.equals(""))
        {
            return 0;
        }
        for(int i=0;i<my_string.length();i++)
        {
            switch(my_string.charAt(i))
            {
                case '0':
                    sb.append(my_string.charAt(i));
                    break;
                case '1':
                    sb.append(my_string.charAt(i));
                    break;
                case '2':
                    sb.append(my_string.charAt(i));
                    break;
                case '3':
                    sb.append(my_string.charAt(i));
                    break;
                case '4':
                    sb.append(my_string.charAt(i));
                    break;
                case '5':
                    sb.append(my_string.charAt(i));
                    break;
                case '6':
                    sb.append(my_string.charAt(i));
                    break;
                case '7':
                    sb.append(my_string.charAt(i));
                    break;
                case '8':
                    sb.append(my_string.charAt(i));
                    break;
                case '9':
                    sb.append(my_string.charAt(i));
                    break;
                default:
                    if(!sb.toString().equals(""))
                    {
                        answer += Integer.valueOf(sb.toString());
                        sb.setLength(0); // sb 초기화
                    }
                    break;
            }
        }
        if(!sb.toString().equals(""))
        {
            answer += Integer.valueOf(sb.toString());
        }
        return answer;
    }
}
// 다른 풀이
// 정규식으로 푼 풀이 
// 가독성은 좋지만 속도가 느린편이다
메모리: 80.1 MB, 시간: 0.27 ms
class Solution {
    public int solution(String my_string) {
        int answer = 0;

        String[] str = my_string.replaceAll("[a-zA-Z]", " ").split(" ");

        for(String s : str){
            if(!s.equals("")) answer += Integer.valueOf(s);
        }

        return answer;
    }
}
// 
메모리: 85.7 MB, 시간: 0.05 ms
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
메모리: 95.2 MB, 시간: 0.03 ms
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int ad = -1;
        for(char c : my_string.toCharArray()){
            int cInt =  c;
            if(cInt >= 47 && cInt <= 57){
                if(ad == -1) ad = cInt -48;
                else ad = ad * 10 + (cInt-48);
            }
            else{
                if(ad != -1){
                    answer += ad;
                    ad = -1;
                }
            }
        }
        if(ad != -1) answer += ad;
        return answer;
    }
}
