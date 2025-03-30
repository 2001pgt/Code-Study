import java.util.*;
import java.io.*;

public class Main {
    public static ArrayList<Integer> queue = new ArrayList<>();

    public static void push(int x) {
        queue.add(x);
    }

    public static void pop() {
        if (queue.size() < 1) {
            System.out.println(-1);
        } else {
            System.out.println(queue.get(0));
            queue.remove(0);
        }
    }

    public static void size() {
        System.out.println(queue.size());
    }

    public static void empty() {
        if (queue.isEmpty()) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public static void front() {
        if (queue.size() < 1) {
            System.out.println(-1);
        } else {
            System.out.println(queue.get(0));
        }
    }

    public static void back() {
        if (queue.size() < 1) {
            System.out.println(-1);
        } else {
            System.out.println(queue.get(queue.size() - 1)); // 인덱스 말고 실제 값 출력!
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            String[] parts = input.split(" ");
            String command = parts[0];

            if (command.equals("push")) {
                int value = Integer.parseInt(parts[1]);
                push(value);
            } else if (command.equals("pop")) {
                pop();
            } else if (command.equals("size")) {
                size();
            } else if (command.equals("empty")) {
                empty();
            } else if (command.equals("front")) {
                front();
            } else if (command.equals("back")) {
                back();
            }
        }
    }
}
