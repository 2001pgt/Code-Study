import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<Integer> deque = new ArrayList<>();

    static void push_front(int x) { deque.add(0, x); }
    static void push_back(int x)  { deque.add(x); }
    static void pop_front() {
        if (deque.isEmpty()) System.out.println(-1);
        else {
            System.out.println(deque.get(0));
            deque.remove(0);
        }
    }
    static void pop_back() {
        if (deque.isEmpty()) System.out.println(-1);
        else {
            System.out.println(deque.get(deque.size() - 1));
            deque.remove(deque.size() - 1);
        }
    }
    static void size()  { System.out.println(deque.size()); }
    static void empty() { System.out.println(deque.isEmpty() ? 1 : 0); }
    static void front() {
        System.out.println(deque.isEmpty() ? -1 : deque.get(0));
    }
    static void back() {
        System.out.println(deque.isEmpty() ? -1 : deque.get(deque.size() - 1));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1) 첫 줄에서 명령 개수만 읽는다
        int n = Integer.parseInt(br.readLine());

        // 2) 이후 n줄을 split(" ") 또는 StringTokenizer 로 나눠 처리
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            String[] parts = line.split(" ");

            switch (parts[0]) {
                case "push_front":
                    push_front(Integer.parseInt(parts[1]));
                    break;
                case "push_back":
                    push_back(Integer.parseInt(parts[1]));
                    break;
                case "pop_front":
                    pop_front();
                    break;
                case "pop_back":
                    pop_back();
                    break;
                case "size":
                    size();
                    break;
                case "empty":
                    empty();
                    break;
                case "front":
                    front();
                    break;
                case "back":
                    back();
                    break;
            }
        }
    }
}
