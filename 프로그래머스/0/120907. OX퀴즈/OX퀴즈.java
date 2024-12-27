class Solution {
    public String[] solution(String[] quiz) {
        // 반복으로 퀴즈의 문제를 1개씩 ox를 판단한다.
        // 방법은 문자열을 배열로 변환 시켜 "=" 이전과 이후의 값을 두개의 다른 변수에 저장
        // 값이 같다면 result배열에 "O"추가 틀리면 "X"추가
        boolean operator = true;
        int num = 0; // 퀴즈의 숫자를 저장
        int num2 = 0; // 퀴즈 정답을 저장
        int answer = 0; // 퀴즈를 푼 결과를 저장
        String[] result = new String[quiz.length]; //  OX를 넣어줄 배열 할당
        for(int i=0;i<quiz.length;i++){
            String[] numbers = quiz[i].split(" "); // 문자열을 공백을 기준으로 배열로 변환
            for(int j=0;j<numbers.length;j++){
                // = 이 나오면 다음 배열에있는 문자를 숫자로 바꿔서 num2에 저장 후 종료
                if(numbers[j].equals("=")){ 
                    num2 = Integer.valueOf(numbers[j+1]);
                    break;
                }
                // 더하기 일때
                else if(numbers[j].equals("+")){
                    operator = true;
                    continue;
                }
                // 빼기 일때
                else if(numbers[j].equals("-")){
                    operator = false;
                    continue;
                }
                // 정수 일때 num의 숫자를 answer에 operator의 상태에 따라 연산
                else{
                    num = Integer.valueOf(numbers[j]);
                    if (operator) {
                        answer += num;
                    } 
                    else {
                        answer -= num;
                    }
                }
            }
            // 결과를 정답과 비교
            if(answer == num2){
                result[i] = "O";
            }
            else{
                result[i] = "X";
            }
            // 한 문제의 OX 판단이 끝나면 다음 문제로 넘어가기위해 초기화 할 변수들
            answer = 0;
            operator = true;
            num = 0;
            num2 = 0;
        }
        
        return result;
    }
}