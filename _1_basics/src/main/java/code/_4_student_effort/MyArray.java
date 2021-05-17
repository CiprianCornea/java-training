package code._4_student_effort;

public class MyArray {
    public void workWithArray() {
        int[] array;
        array = new int[3];

        array[0] = 100;
        array[1] = 200;
        array[2] = 300;

        for (int i = 0; i < 3; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public void arrayCopyMethod() {
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};

        char[] copyTo = new char[7];

        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo));
    }

    public void copyOfRangeMethod() {
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};

        char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);

        System.out.println(new String(copyTo));
    }
}
