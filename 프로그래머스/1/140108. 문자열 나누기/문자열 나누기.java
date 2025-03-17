class Solution {
    public int solution(String s) {
        // 첫문자를 x라고 한다.
        // 문자열의 처음부터 읽기 시작 
        // x가 나오면 x횟수 +1
        // x를 제외한 나머지가 나오면 나머지문자 횟수 +1
        // 이 둘이 같아지면 모든 카운트를 0으로하고 분리횟수 +1
        
        // 다음 등장하는 문자를 x라고 하고 위의 행동 반복
        // 만약 횟수가 같지않고 종료시 분리 횟수 +1
        // 만약 다음 모든 카운트가 0이면 분리 횟수 + 하지않음 -> 딱맞게 끝난다는 뜻
        int xCnt = 0;
        int notxCnt = 0;
        int answer = 0;
        char x = 'a';
        for(char c : s.toCharArray()){
            if(xCnt == 0 && notxCnt == 0){
                x = c;
            }
            if(c == x){
                xCnt++;
            }
            else{
                notxCnt++;
            }
            if(xCnt == notxCnt){
                xCnt = 0;
                notxCnt = 0;
                answer++;
            }
        }
        if(xCnt != notxCnt){
            answer++;
        }
        return answer;
    }
}