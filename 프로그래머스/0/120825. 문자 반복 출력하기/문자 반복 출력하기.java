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
// split()을 사용해서 문자열 배열생성하는 방법
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] str = my_string.split(""); // 입력받은 문자열을 한 글자씩 문자열로 쪼개서 배열로 만든다.
        for(int i=0; i<my_string.length(); i++){
            answer += str[i].repeat(n); // repeat를 사용하여 반복
        }
        return answer;
    }
}
// 문자열 연결 시, 기존 문자열이 불변(immutable)이므로, 새로운 문자열 객체가 매번 생성되서 성능 저하가 예상된다.
// StringBuilder를 사용하는 것이 좀 더 효율적일듯
// 하지만 가독성은 이게 더 좋은듯하다.
