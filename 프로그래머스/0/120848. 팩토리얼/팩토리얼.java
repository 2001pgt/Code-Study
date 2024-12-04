class Solution {
    public int solution(int n) {
        int answer = 1;
        int x = 1;
        while(true){
            x *= answer;
            if(x>n){
                break;
            }
            answer++;
        }
        return answer-1;
    }
}