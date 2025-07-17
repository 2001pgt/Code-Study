import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력
        //int N = Integer.parseInt(br.readLine());
        String line = br.readLine();
        br.close();

        // StringTokenizer를 이용하여 공백을 입력받은 정수를 리스트에 추가
        StringTokenizer st = new StringTokenizer(line);
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        for(int i=M;i<=N;i++){
            boolean isprime = true;
            if(i == 2){
                System.out.println(2);
                continue;
            }
            if(i % 2 == 0 || i == 1){
                continue;
            }
            int rootCeil = (int) Math.ceil(Math.sqrt(i));
//            System.out.println(rootCeil);
            for(int j=2;j<=rootCeil;j++){
                // i가 소수가 아니라면 다음 숫자를 판단
                if(i % j == 0){
                    isprime = false;
                    break;
                }
            }
            if(isprime){
                System.out.println(i);
            }
        }

//        for (int i = 0; i < N; i++) {
//            arr[i] = Integer.parseInt(st.nextToken());
//        }


    }
}
