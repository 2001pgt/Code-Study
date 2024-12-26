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

// 다른 풀이 문자열 "-"에 정수를 더해서 문자열로 만든뒤 k를 문자열로 바꿔 해당 값이 있는 인덱스를 찾아냄 "-"을 한 이유는 인덱스 는 0부터 세기 때문에 +1해주기위해
class Solution {
    public int solution(int num, int k) {
        return ("-" + num).indexOf(String.valueOf(k));
    }
}
