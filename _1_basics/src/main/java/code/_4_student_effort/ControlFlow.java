package code._4_student_effort;

public class ControlFlow {
    public int currentSpeed = 10;
    public boolean isMoving = false;

    void applyBrakes() {
        if (isMoving) { // decision statement
            currentSpeed--;
        } else {
            //System.err.println("The bicycle has already stopped!");
            System.out.println("The bicycle has already stopped!");
        }
    }

    void test() {
        int mood = 2;
        String moodString;

        switch (mood) { // decision statement
            case 1:
                moodString = "Sad";
                break; // branching statement
            case 2:
                moodString = "Happy";
                break; // branching statement
            default:
                moodString = "Invalid statement";
                break; // branching statement
        }
        System.out.println(moodString);
    }

    void test2() {
        // V1
        System.out.println("V1");
        int count = 1;
        while (count < 11) { // looping statement
            System.out.println("Count is: " + count);
            count++;
        }

        // V2
        System.out.println();
        System.out.println("V2");
        count = 1;
        do { // looping statement
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);

        // V3
        System.out.println();
        System.out.println("V3");
        for (int i = 1; i < 11; i++) {
            System.out.println("Count is: " + i);
        }

        // V4
        System.out.println();
        System.out.println("V4");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int item : numbers) { // enhanced for
            System.out.println("Count is: " + item);
        }

    }
}
