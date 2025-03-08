class Solution {
    public int[] solution(int[] answers) {
        
        
        // 1번 1, 2, 3, 4, 5
        // 2번 2, 1, 2, 3, 2, 4, 2, 5
        // 3번 3, 3, 1, 1, 2, 2, 4, 4, 5, 5
        // 각 수포자의 정답개수를 담을 변수를 만든다.
        int answer1 = 0;
        int answer2 = 0;
        int answer3 = 0;
        // 찍기 패턴 배열을 만든다.
        int[] zzik1 = {1, 2, 3, 4, 5};
        int[] zzik2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] zzik3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        // 정답을 for문을 돌려 맞은 사람은 그사람의 정답개수를 +1한다.
        // 수포자의 찍는 패턴크기에 맞춰 i에서 나눈 나머지 인덱스 위치에 찍은 답을 정답과 비교하여 채점
        // 맞다면 정답개수 +1
        for(int i=0;i<answers.length;i++){
            if(zzik1[i%zzik1.length] == answers[i])
                answer1++;
            if(zzik2[i%zzik2.length] == answers[i])
                answer2++;
            if(zzik3[i%zzik3.length] == answers[i])
                answer3++;
        }
        // System.out.println(answer1);
        // System.out.println(answer2);
        // System.out.println(answer3);
        if(answer1 == answer2){
            if(answer2 == answer3)
                return new int[]{1,2,3};
            else
                return new int[]{1,2};
        }
        else if(answer1 == answer3 && answer3>answer2){
            return new int[]{1,3};
        }
        else if(answer2 == answer3 && answer3>answer1){
            return new int[]{2,3};
        }
        else{
            return (answer1>answer2) ? (answer1>answer3 ? new int[]{1}:new int[]{3}):(answer2>answer3 ? new int[]{2}:new int[]{3});
        }
    }
}