class Solution {
    public int solution(int n, int t) {
        // for문으로 t번 곱하는 것을 반복한다.
        int answer = n;
        for(int i=0;i<t;i++){
            answer *= 2;
        }
        return answer;
    }
}