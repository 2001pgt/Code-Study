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
        for (int i = 0; i < 2; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int a = arr[0];
        int b = arr[1];
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        System.out.println(a);
        System.out.println(arr[0]/a*arr[1]);
    }
}
