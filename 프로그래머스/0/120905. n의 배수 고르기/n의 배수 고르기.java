import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        // ArrayList 생성 후 
        // for문으로 배열을 순회하면서 n으로 나눴을 때 0으로 나눠떨어지면 ArrayList에 추가
        // 정수 배열로 바꿔서 리턴
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<numlist.length;i++){
            if(numlist[i] % n == 0){
                list.add(numlist[i]);
            }
        }
        int[] intArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            intArray[i] = list.get(i);
        }

        return intArray;
    }
}