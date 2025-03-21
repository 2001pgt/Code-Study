import java.util.*;

public class Main {
    // 클래스 레벨에서 스택을 선언
    public static ArrayList<Integer> stack = new ArrayList<>();

    public static void push(int x){
        stack.add(x);
    }

    public static void pop (){
        if(stack.size() == 0){
            System.out.println(-1);
        } else {
            // 마지막 요소에 접근하기 위해 index 수정
            System.out.println(stack.get(stack.size() - 1));
            stack.remove(stack.size() - 1);
        }
    }

    public static void size (){
        System.out.println(stack.size());
    }

    public static void empty(){
        if (stack.size() == 0){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public static void top(){
        if (stack.size() == 0){
            System.out.println(-1);
        } else {
            System.out.println(stack.get(stack.size() - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // nextInt() 후 남은 개행 문자 제거

        for (int i = 0; i < n; i++){
            String input = sc.nextLine();
            // 공백을 기준으로 명령어와 인자를 분리
            String[] parts = input.split(" ");
            int value = 0;
            String command = "";
            if(parts.length == 2) {
                command = parts[0];
                try {
                    value = Integer.parseInt(parts[1]);
                } catch(NumberFormatException e) {
                    System.out.println("두 번째 입력값은 숫자가 아닙니다.");
                    continue;
                }
            } else {
                command = parts[0];
            }
            if(command.equals("push")){
                push(value);
            }
            else if(command.equals("pop")){
                pop();
            }
            else if(command.equals("size")){
                size();
            }
            else if(command.equals("empty")){
                empty();
            }
            else if(command.equals("top")){
                top();
            }
        }
        sc.close();
    }
}
