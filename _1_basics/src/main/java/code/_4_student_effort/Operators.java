package code._4_student_effort;

public class Operators {
    public void promoted() {
        int x = 4;
        long y = x * 4 - x++;
        System.out.println("x = " + x); // 5
        System.out.println("y = " + y); // 12

        int a = 5;
        System.out.println(a > 2 ? a < 4 ? 10 : 8 : 7); // 8

        byte a1 = 12;
        byte a2 = 56;

        // byte a3 = a1 + a2; does not compile, why?

        int a3 = a1 + a2;

        System.out.println("a3 = " + a3);
    }
}
