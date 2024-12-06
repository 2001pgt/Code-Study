import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(String my_string) {
        // 정수 배열 생성
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
        Collections.sort(numbers); // 오름차순 정렬
        int[] answer = numbers.stream().mapToInt(Integer::intValue).toArray(); // 일반 정수 배열로 변환
        return answer;
    }
}

// 다른 풀이 속도는 훨씬빠름
import java.util.*;

class Solution {
    public int[] solution(String my_string) {

        // replaceAll메서드로 숫자만 남긴뒤
        my_string = my_string.replaceAll("[a-z]","");
        // 새로운 정수형 배열 생성
        int[] answer = new int[my_string.length()];
        // 정수형 배열에 문자
        for(int i =0; i<my_string.length(); i++){
            // 문자 '0'을 문자인 숫자에서 빼주면 아스키코드 상에서 십진수의 뺄샘이 일어나 정수가 된다.
            answer[i] = my_string.charAt(i) - '0';
        }

        Arrays.sort(answer);

        return answer;
    }
}
