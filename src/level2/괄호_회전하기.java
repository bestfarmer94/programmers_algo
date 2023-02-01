package src.level2;

class 괄호_회전하기 {
    public int solution(String s) {
        int answer = 0;
        String[] gwal = new String[]{"[]", "()", "{}"};
        for (int i = 0; i < s.length(); i++) {
            s = s.substring(1) + s.charAt(0);
            String temp = s;

            while (true) {
                String temp2 = temp;
                for (int j = 0; j < 3; j++) {
                    temp2 = temp2.replace(gwal[j], "");
                }
                if (temp2.equals(temp)) {
                    break;
                }
                temp = temp2;
            }

            answer += temp.equals("") ? 1 : 0;
        }
        return answer;
    }
}