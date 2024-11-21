class Solution {
    public String solution(String my_string) {
        String answer = ""; // 빈 문자열
        for(int i=0;i<my_string.length();i++){
            // for문을 사용해 입력받은 문자열의 마지막 문자부터 차례대로 빈문자열에 삽입
            answer += my_string.charAt((my_string.length()-1)-i); 
        }
        return answer;
    }
}

// 다른 풀이
// StringBuilder 클래스를 사용
class Solution {
    public String solution(String my_string) {
        // StringBuilder는 Java에서 가변 문자열을 다룰 때 사용하는 클래스이다.
        StringBuilder sb = new StringBuilder(); // sb라는 이름의 StringBuilder 객체 생성
        sb.append(my_string); // StringBuilder객체에 입력받은 문자열 추가
        sb.reverse(); // reverse 메서드를 사용하여 추가한 문자열을 뒤집는다.

        return sb.toString(); // toString() 메서드는 StringBuilder 객체의 내용을 **문자열(String)**로 변환해준다.
    }
}
