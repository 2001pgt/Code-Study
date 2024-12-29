메모리: 80.7 MB, 시간: 0.06 ms
class Solution {
    public int solution(int[] array) {
        // 배열의 원소를 추출해서 문자열로 변경
        // 문자열을 다시 문자 배열로 변경 거기서 '7'의 횟수를 카운트 
        int count = 0;
        for(int i=0;i<array.length;i++)
        {
            String str = String.valueOf(array[i]);
            char[] charArray = str.toCharArray();
            for(int j=0;j<str.length();j++)
            {
                if(charArray[j] == '7')
                {
                    count++;
                }
            }
        }
        return count;
    }
}
// 다른풀이
// 나머지를 활용해 수학적으로 풀었다.
// 속도가 내가 작성한 코드보다 훨씬빠르다.
// 아마 문자열 처리를 하지않고 수학적으로만 연산하기 때문에 시간이 훨씬 단축된것으로 보인다.
메모리: 74.8 MB, 시간: 0.02 ms
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int a : array){
            while(a != 0){
                if(a % 10 == 7){
                    answer++;
                }
                a /= 10;
            }
        }
        return answer;
    }
}
