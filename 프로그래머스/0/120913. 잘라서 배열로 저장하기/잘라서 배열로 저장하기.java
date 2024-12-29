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
