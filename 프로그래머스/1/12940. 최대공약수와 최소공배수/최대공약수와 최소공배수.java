class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        // 최대공약수 구하기(유클리드 호제법)
        int a;
        int b;
        int tmp = -1;
        if(n>m){
            a = n;
            b = m;
        }
        else{
            a = m;
            b = n;
        }
        while(true){
            if(a % b == 0){
                break;
            }
            tmp = a % b;
            a = b;
            b = tmp;
            System.out.println(a);
            System.out.println(b);
        }
        answer[0] = b;
        answer[1] = n*m/b;
        return answer;
    }
}