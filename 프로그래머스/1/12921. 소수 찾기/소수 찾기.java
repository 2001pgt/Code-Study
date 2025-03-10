class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=2;i<=n;i++){
            boolean isPrime = true;
            // System.out.println("i는 "+i);
            for (int j = 2; j <= Math.sqrt(i); j++){
                // System.out.println("j는 "+j);
                if(i%j == 0){
                    isPrime = false;
                    // System.out.println(i+"는 "+j+"로 나눠지므로 소수X");   
                    break;
                }
            }
            if(isPrime){
                // System.out.println(i +"는 소수");     
                answer++;
            }
                
        }
        // System.out.println(j);
        return answer;
    }
}