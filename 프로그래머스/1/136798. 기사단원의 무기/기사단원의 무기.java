메모리: 79.6 MB, 시간: 159.93 ms
class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        // 1~number까지 for문
        // 해당 번호를 한번 더 for문으로 약수의 개수를 구한다.
        // 구한 약수의 개수가 limit보다 높다면 -> power구매
        // 낮다면 약수의 개수 구매
        // 구매 할때마다 answer에 공격력 더해주기
        for(int i=1;i<=number;i++){
            int count = 0;
            for (int j= 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    // j가 약수라면, 함께 나오는 number / j 도 약수입니다.
                    // 단, j와 i/j가 같다면 한 번만 센다.
                    if (j == i / j) {
                        count++;
                    } else {
                        count += 2;
                    }
                }
                // System.out.println(count);
            }
            if(count > limit){
                answer += power;
            }
            else{
                answer += count;
            }
        }
        return answer;
    }
}
// 다른 풀이
// 각 수에 맞는 약수의 개수를 저장하는 배열을 만든뒤
// j는 i의 배수를 만들기 위해 사용합니다. i * j가 number 이하일 때까지만 반복합니다.
// 이때, i는 약수 역할을 하고, j는 나머지 약수 역할을 하게 되어 i * j의 약수 개수를 1씩 증가시킵니다.
메모리: 75.6 MB, 시간: 10.75 ms
class Solution {

    public int solution(int number, int limit, int power) {
        int[] count = new int[number + 1];    
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number / i; j++) {
                count[i * j]++;
            }
        }
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            if (count[i] > limit) {
                answer += power;
            } else {
                answer += count[i];
            }
        }
        return answer;
    }
}
