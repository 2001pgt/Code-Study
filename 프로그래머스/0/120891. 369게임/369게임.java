class Solution {
    public int solution(int order) {
        int answer = 0;
        String str = String.valueOf(order);
        for(int i=0; i<str.length();i++)
        {
            switch (str.charAt(i)){
                case '3':
                    answer+=1;
                    break;
                case '6':
                    answer+=1;
                    break;
                case '9':
                    answer+=1;
            }
            
        }
        return answer;
    }
}

// 다른풀이
// 자바에서 + 연산자는 두 개의 피연산자 중 하나가 문자열이면, 다른 피연산자를 문자열로 자동 변환한 후 문자열 결합을 수행
class Solution {
    public int solution(int order) {
        int answer = 0;

        String str = order+""; // 문자열로 변환

        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c=='3'||c=='6'||c=='9') answer++;
        }

        return answer;
    }
}
