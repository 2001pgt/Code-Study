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