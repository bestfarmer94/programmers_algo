package src.hanghae99;

class 신규_아이디_추천__String_contains__replace_정규식 {
    public String solution(String new_id) {
        String answer = new_id;
        answer = answer.toLowerCase();
        answer = answer.replaceAll("[^a-z0-9._\\-]", "");

        //String도 contains 가 있다.
        while(answer.contains("..")){
            answer = answer.replace("..", ".");
            // if(answer.equals(new_answer)){
            //     break;
            // }
            // answer = new_answer;
        }

        if(answer.length() != 0){
            answer = answer.charAt(0) == '.' ? answer.substring(1) : answer;
        }
        if(answer.length() != 0){
            answer = answer.charAt(answer.length()-1) == '.'
                    ? answer.substring(0, answer.length()-1) : answer;
        }
        answer = answer.length() == 0 ? "a" : answer;
        answer = answer.length() >= 15 ? answer.substring(0, 15) : answer;
        answer = answer.charAt(answer.length()-1) == '.'
                ? answer.substring(0, answer.length()-1) : answer;
        while(answer.length() <= 2){
            answer += answer.charAt(answer.length()-1);
        }
        return answer;
    }

    public static void main(String[] args) {
        신규_아이디_추천__String_contains__replace_정규식 s = new 신규_아이디_추천__String_contains__replace_정규식();
        String str = "=.=";
        System.out.println(s.solution(str));
    }
}