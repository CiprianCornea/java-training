package code._4_student_effort;

public class EqualsClass {
    public void test() {
        String firstString = new String("abc");
        String secondString = new String("abc");

        if(firstString.equals(secondString)){
            // True(objects have same value, but not different memory address
            System.out.println("True");
        }

        if(firstString == secondString){
            // False (objects do not point to the same memory address)
            System.out.println("False");
        }

        secondString = firstString;
        if(firstString == secondString){
             // True(Now the objects are the same - same memory address)
            System.out.println("True");
        }
    }

    public void test2(){
        Integer firstInteger = 127;
        Integer secondInteger = 127;

        System.out.println(firstInteger == secondInteger); // true, why?
        System.out.println(firstInteger.equals(secondInteger)); // true

        Integer thirdInteger = 128;
        Integer fourthInteger = 128;

        System.out.println(thirdInteger == fourthInteger); // false, why?
        System.out.println(thirdInteger.equals(fourthInteger)); // true

        Integer integer5 = -127;
        Integer integer6 = - 127;

        System.out.println(integer5 == integer6);
        System.out.println(integer5.equals(integer6));

        Integer integer7 = -129;
        Integer integer8 = -129;

        System.out.println(integer7 == integer8);
        System.out.println(integer7.equals(integer8));
    }
}
