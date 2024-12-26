class Solution {
    public int solution(int n) {
        String str = ""+n;
        int answer = 0;
        for(int i=0;i<str.length();i++){
            answer += Character.getNumericValue(str.charAt(i));
        }
        return answer;
    }
}