import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] target = new int[n];
        for (int i = 0; i < n; i++) {
            target[i] = sc.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int next = 1;
        boolean possible = true;

        for (int i = 0; i < n; i++) {
            int current = target[i];
            while (next <= current) {
                stack.push(next++);
                sb.append("+\n");
            }
            if (stack.peek() == current) {
                stack.pop();
                sb.append("-\n");
            } else {
                possible = false;
                break;
            }
        }
        if (!possible) {
            System.out.println("NO");
        } else {
            System.out.println(sb.toString());
        }
    }
}
