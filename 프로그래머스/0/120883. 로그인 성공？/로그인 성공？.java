class Solution {
    public String solution(String[] id_pw, String[][] db) {
    
        // 아이디가 db안에 있는지확인
        // 확인 후 아이디가 있다면 해당 배열의 비밀번호와 내 비밀번호를 비교
        // 맞다면 login
        // 다르다면 wrong pw
        // 만약 일치하는 아이디가 없다면 fail
        for(int i=0;i<db.length;i++)
        {
            if(id_pw[0].equals(db[i][0]))
            {
                if(id_pw[1].equals(db[i][1]))
                {return "login";}
                else
                {return "wrong pw";}
            }
        }
        return "fail";
    }
}