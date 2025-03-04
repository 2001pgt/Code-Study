import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        // 두 카드뭉치에서 맨 앞에있는 카드만 사용할 수 있다.
        // goal의 맨앞 단어부터 하나씩 두 카드뭉치 맨앞카드와 같은지 비교후 같다면 해당 카드를 카드뭉치에서 뺀다.
        // 그리고 goal의 다음 단어로 넘어간다.
        // 만약 두카드뭉치 맨앞카들이 전부 goal의 단어와 맞지 않다면 "No" 반환한다.
        Queue<String> queue1 = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> queue2 = new LinkedList<>(Arrays.asList(cards2));
        for(int i=0;i<goal.length;i++){
            // 첫번째 카드뭉치의 맨앞카드와 비교
            if(queue1.peek() != null && queue1.peek().equals(goal[i])){
                queue1.poll();
                continue;
            }
            // 두번째 카드뭉치의 맨앞카드와 비교
            else if(queue2.peek() != null && queue2.peek().equals(goal[i])){
                queue2.poll();
                continue;
            }
            // 만약 둘다 goal의 단어와 일치하지 않는다면
            else{
                return "No";
            }
        }
        // System.out.println(queue1);
        // System.out.println(queue2);
        return "Yes";
    }
}