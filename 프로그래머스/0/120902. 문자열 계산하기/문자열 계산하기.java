class Solution {
    public int solution(String my_string) {
        // 공백을 기준으로 문자열 배열로 나눈다
        // 각각의 원소가 연산자일때와 아닐때로 구분한뒤
        // 아닐때는 해당 원소를 정수로 변환하여 부호에 맞게 더한다.
        boolean operator = true;
        int num = 0;
        int answer = 0;
        String[] numbers = my_string.split(" "); // 문자열 배열로 변환
        for(int i=0;i<numbers.length;i++){
            // 더하기 일때
            if(numbers[i].equals("+")){
                operator = true;
                continue;
            }
            // 빼기 일때
            else if(numbers[i].equals("-")){
                operator = false;
                continue;
            }
            // 정수 일때
            else{
                num = Integer.valueOf(numbers[i]);
                if (operator) {
                    answer += num;
                } 
                else {
                    answer -= num;
                }
            }
        }
        return answer;
    }
}