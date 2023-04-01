package linear_search;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {
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
        ArrayList<Integer> collection = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 9, 10, 23));

        Integer target = 10;

        Integer index = linearSearch(collection, target);
        if (index != null) {
            System.out.println(MessageFormat.format("{0} found at index {1}", target, index));
        }
    }
}
