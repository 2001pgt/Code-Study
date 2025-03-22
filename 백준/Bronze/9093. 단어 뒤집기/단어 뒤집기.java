import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 남은 개행 문자 소비

        // 단어를 한문자씩 스택에 집어넣는다.
        // 그리고 pop하여 문자열에 추가한다.
        // 그리고 해당 문자열을 배열의 원래 자리에 넣는다.
        for(int x = 0;x<n;x++){
            Stack<Character> stack = new Stack<>();
            StringBuilder sb = new StringBuilder();
            String input = sc.nextLine();
            String[] words = input.split(" ");
            for(int i=0;i< words.length;i++){
                for(char c : words[i].toCharArray()){
                    stack.push(c);
                }
                while(!stack.isEmpty()){
                    sb.append(stack.pop());
                }
                words[i] = sb.toString();
                // StringBuilder를 비우기
                sb.setLength(0);
            }
            for(String s : words){
                System.out.print(s+" ");
            }
            System.out.println();
        }
    }
}

