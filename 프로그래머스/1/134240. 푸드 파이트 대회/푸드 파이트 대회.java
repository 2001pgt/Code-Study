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