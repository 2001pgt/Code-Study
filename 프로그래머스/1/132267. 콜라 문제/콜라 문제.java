class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n>=a){
            answer += b*(n/a);
            n = b*(n/a)+(n%a);
            System.out.println("n: "+n);
            System.out.println("answer: "+answer);
        }
        return answer;
    }
    
}