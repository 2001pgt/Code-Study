import java.util.ArrayList;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=0;i<my_string.length();i++){
            // 문자열을 한문자씩 숫자인지확인 후 숫자면 정수 배열에 추가
            switch(my_string.charAt(i)){
                case '0':
                    numbers.add(0);
                    break;
                case '1':
                    numbers.add(1);
                    break;
                case '2':
                    numbers.add(2);
                    break;
                case '3':
                    numbers.add(3);
                    break;
                case '4':
                    numbers.add(4);
                    break;
                case '5':
                    numbers.add(5);
                    break;
                case '6':
                    numbers.add(6);
                    break;
                case '7':
                    numbers.add(7);
                    break;
                case '8':
                    numbers.add(8);
                    break;
                case '9':
                    numbers.add(9);
            }
        }
        for(int i:numbers){
            answer += i;
        }
        return answer;
    }
}