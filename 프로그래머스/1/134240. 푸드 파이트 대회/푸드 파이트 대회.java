메모리: 87.2 MB, 시간: 13.13 ms
import java.util.*;
class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        String answer = "";
        // 일단 홀수개인 음식은 -1 한다
        for(int i=0;i<food.length;i++){
            if(food[i] % 2 != 0){
                food[i]--;
            }
            // System.out.println(Arrays.toString(food));
        }
        // 그리고 food배열의 각 인자의 절반만큼 해당 인덱스를 문자열에 추가한다
        for(int i=0;i<food.length;i++){
            for(int j=0;j<food[i]/2;j++){
                sb.append(Integer.toString(i));
                // System.out.println(sb);
            }
        }
        answer = sb.toString()+"0"+sb.reverse().toString();
        return answer;
    }
}
// 스택을 이용한 풀이
StringBuilder에 음식을 넣으면서 같이 스택에도 넣었은 뒤
StringBuilder에 음식 넣기가 끝난후 스택의 특성인 LIFO 때문에 pop을 하면 역순으로 나온다는것을 이용해
pop을 음식을 다시StringBuilder에 넣어주었다. 속도도 굉장히 빠르다
메모리: 74.1 MB, 시간: 4.52 ms
import java.util.Stack;
class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i < food.length; i++) {
            int tmp = food[i]/2;
            for (int j = 0; j < tmp; j++) {
                sb.append(i);
                stack.push(i);
            }
        }
        sb.append(0);
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
