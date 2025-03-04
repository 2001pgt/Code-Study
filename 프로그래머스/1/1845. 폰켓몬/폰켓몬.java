import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        // 일단 N/2 만큼 뽑을수 있다.
        int picks = nums.length/2;
        // 중복을 지운다.
        Set<Integer> pocket = new HashSet<>();
        for(int num : nums){
            pocket.add(num);
        }
        
        System.out.println(pocket);
        // 이때 set의 크기가 picks보다 낮으면 해당 크기 반환
        if(pocket.size()<picks){
            return pocket.size();
        }
        // 높으면 picks크기 반환 
        else{
            return picks;
        }
         
    }
}