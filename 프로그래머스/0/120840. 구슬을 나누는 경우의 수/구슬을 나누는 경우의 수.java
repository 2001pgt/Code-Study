import java.math.BigInteger;

class Solution {
    public BigInteger solution(int balls, int share) {
        // 팩토리얼 계산을 위한 BigInteger 초기화
        BigInteger n = BigInteger.ONE; // balls!
        BigInteger k = BigInteger.ONE; // (balls-share)!
        BigInteger m = BigInteger.ONE; // share!
        
        // balls! 계산
        for (int i = balls; i > 0; i--) {
            n = n.multiply(BigInteger.valueOf(i));
        }

        // (balls-share)! 계산
        for (int i = (balls - share); i > 0; i--) {
            k = k.multiply(BigInteger.valueOf(i));
        }

        // share! 계산
        for (int i = share; i > 0; i--) {
            m = m.multiply(BigInteger.valueOf(i));
        }

        // 경우의 수 계산: n / (k * m)
        BigInteger answer = n.divide(k.multiply(m));
        return answer;
    }
}
