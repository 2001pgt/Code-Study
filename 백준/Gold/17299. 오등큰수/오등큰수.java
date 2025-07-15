import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력
        int N = Integer.parseInt(br.readLine());
        String line = br.readLine();
        br.close();
        // StringTokenizer를 이용하여 공백을 입력받은 정수를 리스트에 추가
        StringTokenizer st = new StringTokenizer(line);
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        // System.out.println(N);
        // System.out.println(list);
        // 리스트이 끝 원소부터 현재 i번째 원소랑 크기 비교를 한다.
        // i 번째 원소보다 크면 그수는 현재 NGE(i) 이다. 작으면 무시
        // 그렇게 i+1번째 원소까지 모두 비교하고 NGE(i) 를 빈리스트에 추가한다.

        // 변수
        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Integer> stackIndex = new ArrayDeque<>();
        // 카운트 배열 만들기
        int[] cnt = new int[N];
        int[] arr2 = new int[1000001];
        for(int i=0;i<N;i++){
            arr2[arr[i]]++;
        }
        for(int i=0;i<N;i++){
            cnt[i] = arr2[arr[i]];
        }
//        for(int i=0;i<N;i++){
//            System.out.println(cnt[i]);
//        }
        int[] ngeList = new int[N];
        for(int i=0;i<N;i++){
//            System.out.println("현재 스택: "+ stack);
            while (stack.size()>0 && stack.peek() < cnt[i]){
                stack.pop();
                int nowindex =  stackIndex.pop();
                ngeList[nowindex] = arr[i];
            }
            if (i == N-1) {
                ngeList[i] = -1;
            }
            else if(cnt[i]<cnt[i+1]){
                ngeList[i] = arr[i+1];
            }
            else {
                stack.push(cnt[i]);
                stackIndex.push(i);
            }
//            System.out.println("현재 스택2: "+ stack);
        }
//        System.out.println("현재 인덱스 스택: "+ stackIndex);
        while (stack.size()>0){
            stack.pop();
            int inx = stackIndex.pop();
            ngeList[inx] = -1;
        }
//        System.out.println("현재 스택3: "+ stack);
        StringBuilder sb = new StringBuilder();
        for (int v : ngeList) {
            sb.append(v).append(' ');
        }
        System.out.println(sb.toString().trim());
    }
}
