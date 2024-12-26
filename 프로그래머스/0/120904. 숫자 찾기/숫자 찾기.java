class Solution {
    public int solution(int num, int k) {
        // num을 문자열로 바꿔서 
        // 문자열의 각 문자를 정수로 바꾼뒤 k 와 비교
        // 있으면 해당 인덱스+1값을 result에 저장
        int answer = -1;
        String str = String.valueOf(num);
        for(int i=0;i<str.length();i++){
            if(Character.getNumericValue(str.charAt(i)) == k){
                answer = i+1;
                break;
            }
        }
        return answer;
    }
}