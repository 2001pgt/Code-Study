import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 입력 받기 (계산 정밀도를 위해 double로 받습니다)
        // int로 받으면 나눗셈할 때 소수점이 바로 사라져서 오차가 생길 수 있습니다.
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        // 2. 두 가지 경우의 수 계산
        // 경우 1: A * B / C
        double case1 = (a * b) / c;
        
        // 경우 2: A / B * C
        double case2 = (a / b) * c;

        // 3. 둘 중 더 큰 값 찾기 (삼항 연산자 써도 되지만, Math.max가 편합니다)
        double maxVal = Math.max(case1, case2);

        // 4. 결과 출력 (소수점 버림)
        // 값이 int 범위를 넘을 수 있으므로 반드시 (long)으로 형변환해야 합니다!
        System.out.println((long) maxVal);
        
        sc.close();
    }
}