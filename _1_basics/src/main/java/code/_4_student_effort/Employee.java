package code._4_student_effort;

public class Employee {
    static int daysOff = 21;
    String name;
    int getHolidayPayment(int amount) {
        int extra = 100;
        return daysOff * amount + extra;
    }
}
