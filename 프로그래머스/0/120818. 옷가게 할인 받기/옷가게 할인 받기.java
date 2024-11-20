class Solution {
    public int solution(int price) {
        int answer = 0;
        double ratio=((price>=500000)?(0.8):((price>=300000)?(0.9):((price>=100000)?(0.95):(1.0))));
        answer = (int)(price*ratio);
        return answer;
    }
}