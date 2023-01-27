package src.hanghae99;

import java.time.LocalDate;

public class 알고리즘_2016년_LocalDate_getDayOfWeek {
    public String solution(int a, int b) {
        String answer = "";

//        calendar.set(2016, a, b);
//        int day_of_week = calendar.DAY_OF_WEEK;
//        int number = calendar.get(Calendar.DAY_OF_WEEK);
//        System.out.println(number);
//        System.out.println(day_of_week);

        LocalDate date = LocalDate.of(2016, a, b);
        answer = date.getDayOfWeek().toString().substring(0, 3);
        return answer;
    }

    public static void main(String[] args) {
        알고리즘_2016년_LocalDate_getDayOfWeek s = new 알고리즘_2016년_LocalDate_getDayOfWeek();
        int a = 5;
        int b = 24;
        System.out.println(s.solution(a, b));
    }
}
