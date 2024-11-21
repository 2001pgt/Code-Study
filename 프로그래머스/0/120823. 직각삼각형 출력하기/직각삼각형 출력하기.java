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
            System.out.println("");
        }
    }
}