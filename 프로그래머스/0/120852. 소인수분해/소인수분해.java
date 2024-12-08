import java.util.*;
class Solution {
    public int[] solution(int n) {
        HashSet<Integer> set = new HashSet<>();
        
        while(n>1){
            for(int i=2;i<=n;i++){
                if(n % i == 0){
                    n = n/i;
                    set.add(i);
                    break;
                }
            }
        }
        
        int[] answer = set.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }
}