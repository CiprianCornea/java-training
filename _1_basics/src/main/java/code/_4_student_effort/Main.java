package code._4_student_effort;

public class Main {

    public static void main(String[] args) {
        //TODO put your code changes in here

        // First example (Variables)
        Employee employee1 = new Employee();
        System.out.println("================ Variables -ex 01 ==============");
        System.out.println(employee1.name);
        System.out.println(employee1.getHolidayPayment(10));
        System.out.println(Employee.daysOff);
        System.out.println();

        // Second example (Variables)
        Variables variables = new Variables();
        System.out.println("================ Variables -ex 02 ==============");
        System.out.println(variables.resultLiteral);
        System.out.println(variables.capitalC);
        System.out.println(variables.byteLiteral);
        System.out.println(variables.shortLiteral);
        System.out.println(variables.intLiteral);
        System.out.println(variables.floatLiteral);
        System.out.println(variables.doubleLiteral);
        System.out.println(variables.hexVal);
        System.out.println(variables.binVal);
        System.out.println();

        // Array example 01
        System.out.print("Array values: ");
        MyArray myArray = new MyArray();
        myArray.workWithArray();
        System.out.println('\n');

        // Array example 02
        System.out.print("Array values: ");
        myArray.arrayCopyMethod();
        System.out.println();

        // Array example 03
        System.out.print("Array values: ");
        myArray.copyOfRangeMethod();
        System.out.println();

        // Operator
        Operators operator = new Operators();
        System.out.println("Operators example 01: ");
        operator.promoted();
        System.out.println();

        // Equals vs == example
        System.out.println("Equals vs == example 1: ");
        EqualsClass equalsClass = new EqualsClass();
        equalsClass.test();

        System.out.println("Equals vx == example 2: ");
        equalsClass.test2();
        System.out.println();

        // Control Flow example
        System.out.println("Control flow example 1: ");
        ControlFlow controlFlow = new ControlFlow();
        controlFlow.applyBrakes();
        System.out.println();

        System.out.println("Control flow example 2: ");
        controlFlow.test();
        System.out.println();

        System.out.println("Control flow example 3: ");
        controlFlow.test2();

        System.out.println("Code challenge 3: ");
        Integer[] array1 = {1, 1, 0, -1, -1};
        CodeChallenge3 codeChallenge3 = new CodeChallenge3();
        int val = codeChallenge3.countPairs(array1);
        System.out.print("Answer: ");
        System.out.println(val);
        System.out.println();

        System.out.println("Code challenge 4: ");
        Integer[] array2 = {-1, -1, -1, 2};
        CodeChallenge4 codeChallenge4 = new CodeChallenge4();
        int val2 = codeChallenge4.countPairs(array2);
        System.out.print("Answer: ");
        System.out.println(val2);
    }
}
