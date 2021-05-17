package code._4_student_effort;

public class CodeChallenge4 {
    public int countPairs(Integer[] numbers) {
        // value that count number of pairs
        int pairs = 0;

        // a new array, where i put the index of all values from given array that are already included in a pair
        Integer[] alreadyIncludedInPairs = new Integer[numbers.length];

        // index for this array
        int index = 0;

        // the length of given array
        int length = numbers.length;

        // now i check how many pair i have in array
        for (int i = 0; i < length - 2; i++) {
            for (int j = i + 1; j < length - 1; j++) {
                for (int k = j + 1; k < length; k++) {
                    // i assume that current elements aren't in a pair
                    boolean isInAPair = false;

                    // i check if current elements are already count as a pair
                    for (int l = 0; l < index; l++) {
                        if (alreadyIncludedInPairs[l] == i || alreadyIncludedInPairs[l] == j || alreadyIncludedInPairs[l] == k) {
                            isInAPair = true;
                            break;
                        }
                    }

                    // i check if numbers[i] and numbers[j] are a pair
                    if (!isInAPair && (numbers[i] + numbers[j] + numbers[k] == 0)) {
                        alreadyIncludedInPairs[index++] = i;
                        alreadyIncludedInPairs[index++] = j;
                        alreadyIncludedInPairs[index++] = k;
                        pairs++;
                        break;
                    }
                }
            }
        }

        // return number of pairs
        return pairs;
    }
}
