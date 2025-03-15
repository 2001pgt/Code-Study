import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution{
    public static int solution(String dartResult) {
        int[] scores = new int[3];  // 3번의 다트 점수를 저장할 배열
        int idx = 0;  // 현재 다트 기회 인덱스

        // 정규표현식: 하나 이상의 숫자, 보너스 문자, 옵션(없을 수도 있음)
        Pattern pattern = Pattern.compile("(\\d+)([SDT])([*#]?)");
        Matcher matcher = pattern.matcher(dartResult);

        while (matcher.find()) {
            int score = Integer.parseInt(matcher.group(1));  // 점수
            String bonus = matcher.group(2);  // 보너스: S, D, T
            String option = matcher.group(3); // 옵션: *, # 또는 빈 문자열

            // 보너스에 따른 점수 계산
            switch (bonus.charAt(0)) {
                case 'S':
                    score = (int) Math.pow(score, 1);
                    break;
                case 'D':
                    score = (int) Math.pow(score, 2);
                    break;
                case 'T':
                    score = (int) Math.pow(score, 3);
                    break;
            }

            // 옵션 처리: "*"이면 현재 점수와 바로 전 점수를 2배, "#"이면 현재 점수를 음수로 전환
            if (option.equals("*")) {
                score *= 2;
                if (idx > 0) {
                    scores[idx - 1] *= 2;
                }
            } else if (option.equals("#")) {
                score *= -1;
            }

            scores[idx++] = score;
        }

        // 최종 점수 합산
        int answer = 0;
        for (int s : scores) {
            answer += s;
        }
        return answer;
    }

    public static void main(String[] args) {
        String dartResult1 = "1S2D*3T";   // 예시: 결과는 37
        String dartResult2 = "1D2S#10S";   // 예시: 결과는 9
        System.out.println("Result 1: " + solution(dartResult1));
        System.out.println("Result 2: " + solution(dartResult2));
    }
}
