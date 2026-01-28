import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // 전체 학생 체육복 갯수 리스트생성 
        List<Integer> total_Uniform = new ArrayList<>(Collections.nCopies(n, 1));
        System.out.println(total_Uniform);
        // 체육복 잃어버린 학생 체크
        for(int i : lost){
            int now_Uniform = total_Uniform.get(i-1);
            total_Uniform.set(i-1,now_Uniform-1);
        }
        // 여분 체육복 가진사람 리스트에 반영
        for(int i : reserve){
            int now_Uniform = total_Uniform.get(i-1);
            total_Uniform.set(i-1,now_Uniform+1);
        }
        System.out.println(total_Uniform);
        for(int i=0;i<n;i++){
            if(total_Uniform.get(i) == 0){
                // 첫번째는 뒤에 사람것만 빌릴 수 있음
                if(i == 0){
                    if(total_Uniform.get(i+1) == 2 ){
                        total_Uniform.set(i,1);
                        total_Uniform.set(i+1,1);    
                    }
                }
                // 마지막은 앞에 사람것만 빌릴 수 있음
                else if(i == n-1){
                    if(total_Uniform.get(i-1) == 2 ){
                        total_Uniform.set(i,1);
                        total_Uniform.set(i-1,1);    
                    }
                }
                // 나머지
                else{
                    // 
                    if(total_Uniform.get(i-1) == 2 ){
                        total_Uniform.set(i,1);
                        total_Uniform.set(i-1,1);    
                    }
                    else{
                        if(total_Uniform.get(i+1) == 2 ){
                        total_Uniform.set(i,1);
                        total_Uniform.set(i+1,1);    
                        }
                    }
                }
            }
        }
        System.out.println(total_Uniform);
        int count = 0;
        for (int num : total_Uniform) {
            if (num != 0) {
                count++;
            }
        }
        return count;
    }
}