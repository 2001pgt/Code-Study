import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        for(int i=1;i<=n;i++){
            int count = 0; // *의 출력횟수를 세는 변수
            // *출력횟수가 i번 만큼 출력되게하는 조건
            while(count<i){ 
                System.out.print("*"); // 출력
                count++; // * 출력횟수 증가
            }
            System.out.println(); // 줄바꿈
        }
    }
}

// 다른 풀이
// repeat()메서드를 사용한 풀이
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println("*".repeat(i)); // i번 출력한다.
        }
    }
}
// 2중 for문을 사용한 풀이
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            // j<i를 설정하여 i번 출력되게하였다.
            for(int j=0; j<=i; j++){ 
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
// 속도는 셋중에서 2번째 repeat()을 사용한 풀이가 가장 빠르것으로 예상된다.
// 왜냐하면 다른 풀이들은 2중 반복문이지만 repeat()은 반복문을 한번만 사용하여 속도가 훨씬 빠를것으로 예상 된다.
