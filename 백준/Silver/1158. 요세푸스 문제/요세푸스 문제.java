import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();           // "4 3" 전체를 문자열로 읽음
        String[] tokens = input.split(" ");       // 공백을 기준으로 분리
        int n = Integer.parseInt(tokens[0]);   // 첫 번째 숫자 파싱
        int k = Integer.parseInt(tokens[1]);   // 두 번째 숫자 파싱
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1;i<=n;i++){
            queue.add(i);
        }
        while (queue.size() >= 1){
            for(int i=0;i<k-1;i++){
                queue.add(queue.peek());
                queue.poll();
            }
            arr.add(queue.peek());
            queue.poll();
        }
        // 원하는 형식 "<3, 6, 2, 7, 5, 1, 4>" 로 출력하기
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for(int i = 0; i < arr.size(); i++){
            sb.append(arr.get(i));
            if(i != arr.size() - 1){
                sb.append(", ");
            }
        }
        sb.append(">");

        System.out.println(sb.toString());

    }
}
