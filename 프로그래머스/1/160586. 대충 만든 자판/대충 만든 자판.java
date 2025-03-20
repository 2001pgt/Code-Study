class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        for (int t = 0; t < targets.length; t++) {
            String target = targets[t];
            int totalClicks = 0;
            boolean impossible = false;
            
            for (char c : target.toCharArray()) {
                int minClicks = Integer.MAX_VALUE;
                
                // 각 keymap 문자열에 대해 최소 클릭 수 찾기
                for (String key : keymap) {
                    int index = key.indexOf(c);
                    if (index != -1) {
                        // 클릭 수는 index+1 (1부터 시작)
                        minClicks = Math.min(minClicks, index + 1);
                    }
                }
                
                // 만약 해당 문자를 누를 수 있는 키가 없다면
                if (minClicks == Integer.MAX_VALUE) {
                    impossible = true;
                    break;
                } else {
                    totalClicks += minClicks;
                }
            }
            
            // 한 글자라도 누를 수 없는 경우
            answer[t] = impossible ? -1 : totalClicks;
        }
        
        return answer;
    }
}
