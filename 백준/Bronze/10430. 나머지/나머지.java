import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력
        String line = br.readLine();
        br.close();

        // StringTokenizer를 이용하여 공백을 입력받은 정수를 리스트에 추가
        StringTokenizer st = new StringTokenizer(line);
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int A = arr[0];
        int B= arr[1];
        int C = arr[2];
        System.out.println((A+B)%C);
        System.out.println( ((A%C) + (B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C) * (B%C))%C);
    }
}