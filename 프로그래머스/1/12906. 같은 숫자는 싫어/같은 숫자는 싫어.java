메모리: 119 MB, 시간: 25.56 ms
import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int num = arr[0];
        list.add(num);
        for(int i=1;i<arr.length;i++){
            if(arr[i] != num){
                num = arr[i];
                list.add(num);
            }
        }
        int[] intArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            intArray[i] = list.get(i);
        }

        return intArray;
    }
}
// 스택을 활용한 풀이
메모리: 116 MB, 시간: 41.17 ms
import java.util.*;

public class Solution {
    public Stack<Integer> solution(int []arr) {

        Stack<Integer> stack = new Stack<>();
	// 빈 스택을 만들어서 스택이 비거나 피크와 현재 숫자가 다르면 현재숫자를 스택에 푸쉬
        for(int num : arr){
            if(stack.size() == 0 || stack.peek() != num){
                stack.push(num);
            }
        }



        return stack;
    }
}
