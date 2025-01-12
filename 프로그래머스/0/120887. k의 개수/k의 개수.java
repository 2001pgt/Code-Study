메모리: 103 MB, 시간: 41.56 ms
class Solution {
    public int solution(int i, int j, int k) {
        // i~j사이의 수를 문자열로 만든다.
        // 그 수의 문자를 하나씩 k와 비교해 같을때 마다 answer++
        int answer = 0;
        for(int x=i;x<=j;x++){
            String str = String.valueOf(x);
            for(int y=0;y<str.length();y++){
                if(String.valueOf(str.charAt(y)).equals(String.valueOf(k))){
                    answer++;
                }
            }
        }
        return answer;
    }
}
// 다른풀이

// 문자열을 사용하지 않고 수학적으로 풀이하였다.
// 시간을 매우 단축시킨것이 인상적이다.
메모리: 77.8 MB, 시간: 3.63 ms
class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for (int num = i; num <= j; num++){
            int tmp = num;
            while (tmp != 0){
                if (tmp % 10 == k)
                    answer++;
                tmp /= 10;
            }
        }
        return answer;
    }
}
