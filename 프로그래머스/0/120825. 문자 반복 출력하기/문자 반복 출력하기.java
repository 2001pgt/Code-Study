class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for(int i=0;i<my_string.length();i++){
            answer += Character.toString(my_string.charAt(i)).repeat(n);
        }
        return answer;
    }
}

// 다른 풀이
// 2중 for문을 활용한 풀이 
// 가장 많은 사람들의 풀이 방법이다.
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";

        for(int i=0; i<my_string.length(); i++){
            for(int j=0; j<n; j++){
                answer+=my_string.charAt(i);
            }
        }

        return answer;
    }
}
// StringBuilder를 활용한 풀이
class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder(); // 객체 생성
        for(char c : my_string.toCharArray()){ // 문자열을 문자 배열로 변형한 것을 for-each문을 사용해 문자 변수 c에 담는다.
            sb.append((c + "").repeat(n)); // 문자 c를 문자열로 변형하여 n번 반복후 객체에 집어 넣는다.
        }
        return sb.toString(); StringBuilder // 객체의 내용을 String으로 변환하여 반환
    }
}
