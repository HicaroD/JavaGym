package searching;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static Integer iterativeBinarySearch(ArrayList<Integer> collection, int target) {
        Integer lowIndex = 0;
        Integer highIndex = collection.size() - 1;

        while (lowIndex <= highIndex) {
            Integer midIndex = lowIndex + ((highIndex - lowIndex) >> 1);
            Integer midValue = collection.get(midIndex);

            if (midValue.equals(target)) {
                return midIndex;
            } else if (target < midValue) {
                highIndex = midIndex - 1;
            } else {
                lowIndex = midIndex + 1;
            }
        }
        return null;
    }

    public static Integer linearSearch(ArrayList<Integer> collection, int target) {
        for (int i = 0; i < collection.size(); i++) {
            Integer currentValue = collection.get(i);
            if (currentValue.equals(target)) {
                return i;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ArrayList<Integer> collection = new ArrayList<>(
                List.of(1, 2, 3, 4, 5, 6, 8, 9, 10, 23, 25, 30));

        Integer target = 10;

        Integer index = linearSearch(collection, target);
        if (index != null) {
            System.out.println(MessageFormat.format("{0} found at index {1}", target, index));
        }

        index = iterativeBinarySearch(collection, target);
        if (index != null) {
            System.out.println(MessageFormat.format("{0} found at index {1}", target, index));
        }
    }
}
