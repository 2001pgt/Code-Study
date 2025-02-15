class Solution {
    public int solution(int[] number) {
        int answer = 0;
        for(int i=0;i<number.length-2;i++){
            for(int j = i+1;j<number.length-1;j++){
                for(int k = j+1;k<number.length;k++){
                    if(number[i]+number[j]+number[k] == 0){
                        answer++;
                    }
                    System.out.println(number[i]);
                    System.out.println(number[j]);
                    System.out.println(number[k]);
                    System.out.println(number[i]+number[j]+number[k]);
                }
            }
        }
        return answer;
    }
}