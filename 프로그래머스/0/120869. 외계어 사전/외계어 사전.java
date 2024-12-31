class Solution {
    public int solution(String[] spell, String[] dic) {
        // 2중 for문을 사용 spell의 알파벳이 dic의 각 원소안에 있는지 다 확인한다.
        boolean ishave = true;
        for(int i=0;i<dic.length;i++)
        {
            ishave = true;
            for(int j=0;j<spell.length;j++)
            {
                if(!(dic[i].contains(spell[j])))
                {
                    ishave = false;
                    break;
                }
            }
            if(ishave)
                break;
        }
        return ishave ? 1 : 2;
    }
}