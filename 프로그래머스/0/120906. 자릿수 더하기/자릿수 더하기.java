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

// 다른풀이
class Solution {
    public int solution(int n) {
        int answer = 0;

        while(n>0){
            answer+=n%10;
            n/=10;
        }

        return answer;
    }
}
