메모리: 159 MB, 시간: 114.78 ms
import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        // 사과 배열을 정렬한다.
        // 점수가 높은 사과부터 m개씩 담아서 점수를 계산한다.
            // 정렬된 리스트의 m번째 원소의 점수 * m을 한 값을 answer에 추가한다
        // 남은 사과의 개수가 m보다 적다면 종료
        Arrays.sort(score);

        ArrayList<Integer> list = new ArrayList<>();
        for (int num : score) {
            list.add(num);
        }
        Collections.reverse(list);
        for(int i=0;i<score.length/m;i++){
            answer += (list.get(i*m+m-1)*m);
        }
        // System.out.println(Arrays.toString(score));
        // System.out.println(list);
        return answer;
    }
}
// 다른 풀이
// 오름차순 정렬만  한뒤 for문을 배열의 끝에서 부터 시작해 시간을 줄였다.
메모리: 136 MB, 시간: 51.69 ms
import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);

        for(int i = score.length; i >= m; i -= m){
            answer += score[i - m] * m;
        }

        return answer;
    }
}

메모리: 137 MB, 시간: 6.62 ms
import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int[] sc2 = new int[k+1];
        for(int i=0; i<score.length; i++) sc2[score[i]]++; 
        int sum=0, mod=0;
        for(int i=k; i>0; i--){         
            sc2[i]=sc2[i] + mod;       
            sum += sc2[i]/m * m * i;    
            mod = sc2[i]%m;             
        }
        return sum;
    }
}
