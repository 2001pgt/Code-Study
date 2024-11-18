import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
class Solution {
    public int[] solution(int n) {
        int x;
        if(n%2 == 1){
            x = n/2 + 1;
        }
        else{
            x = n/2;
        }
        int[] array = new int[x];
        for(int i=0;i<x;i++){
            array[i] = 1+i*2;
        }
        return array;
    }
}