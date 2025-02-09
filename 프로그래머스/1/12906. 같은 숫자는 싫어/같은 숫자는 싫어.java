import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int num = arr[0];
        list.add(num);
        for(int i=1;i<arr.length;i++){
            if(arr[i] != num){
                num = arr[i];
                list.add(num);
            }
        }
        int[] intArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            intArray[i] = list.get(i);
        }

        return intArray;
    }
}