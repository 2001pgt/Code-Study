import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i == 0){
                numbers.add(i);
            }
        }
        int[] intArray = numbers.stream().mapToInt(Integer::intValue).toArray();
        return intArray;
    }
}