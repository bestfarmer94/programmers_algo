package src.hanghae99;

class 시저_암호__Character_isLowerCase {
    public String solution(String s, int n) {
        char[] carr = s.toCharArray();
        for (int i = 0; i < carr.length; i++) {
            char new_char = ' ';
            if (Character.isLowerCase(carr[i])) {
                new_char = (char) ((carr[i] + n - 'a') % 26 + 'a');
            }
            if(Character.isUpperCase(carr[i])){
                new_char = (char) ((carr[i] + n - 'A') % 26 + 'A');
            }
            carr[i] = new_char;
        }
        return new String(carr);
    }

//    public static void main(String[] args) {
//        Solution s = new Solution();
//        String str = "one4seveneight";
//        s.solution(str);
//    }
}