class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder(my_string);
        for(int i=0;i<my_string.length();i++)
        {
            if(Character.isUpperCase(sb.charAt(i))){
                sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
            }
            else{
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
            }
        }
        return sb.toString();
    }
}

// 다른풀이
// 아스키코드에서 대소문자 차이가 32나는것을 이용
// 대문자면 +32 소문자면 -32
class Solution {
    public String solution(String s) {
        String answer = "";

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=97 && s.charAt(i)<=122){
                answer += (char)(s.charAt(i)-32);
            } else if(s.charAt(i)>=65 && s.charAt(i)<=90){
                answer += (char)(s.charAt(i)+32);
            } else {
                answer += s.charAt(i);
            }
        }

        return answer;
    }
}
