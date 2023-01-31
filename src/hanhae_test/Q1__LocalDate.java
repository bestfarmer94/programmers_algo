package src.hanhae_test;

import java.time.LocalDate;

class Q1__LocalDate {
    public String solution(int month, int day) {
        String answer = "";
        LocalDate date = LocalDate.of(2023, month, day);
        LocalDate date_end = date.plusDays(98);
        if(date_end.isLeapYear()){
            if(date_end.getMonthValue() >= 3 || (date_end.getMonthValue()==2 && date_end.getDayOfMonth()==29)){
                date_end = date_end.plusDays(1);
            }
        }
        answer = date_end.getMonthValue() + "월 " + date_end.getDayOfMonth() + "일";
        return answer;
    }

    public static void main(String[] args) {
        Q1__LocalDate method = new Q1__LocalDate();
        System.out.println(method.solution(1, 18));
    }
}