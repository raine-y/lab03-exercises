import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ContainsPair {

    public static void main(String[] args) {
        checkCase(Arrays.asList(), false, "empty");
        checkCase(Arrays.asList(3), false, "singleton");
        checkCase(Arrays.asList(1, 2, 3, 2), true, "duplicate");
        checkCase(Arrays.asList(5, 2, -10, 44, 90), false, "no duplicate");
        checkCase(Arrays.asList(-2, 4, -2), true, "negative duplicate");
        checkCase(Arrays.asList(7, 7, 7), true, "repeated more than twice");
    }

    public static boolean checkNestedLoops(List<Integer> values) {
        // TODO: compare values using nested loops
        for (int i = 0; i < (values.size() - 1); i++) {
            for (int j = i + 1; j < values.size(); j++) {
                if (values.get(i).equals(values.get(j))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkWithSet(List<Integer> values) {
        // TODO: use a Set to remember values already seen
        Set<Integer> s = new HashSet<Integer>(values);
        return s.size() != values.size();
    }

    private static void checkCase(List<Integer> values, boolean expected, String label) {
        boolean nestedResult = checkNestedLoops(values);
        boolean setResult = checkWithSet(values);
        if (nestedResult == expected && setResult == expected) {
            System.out.println("PASS: " + label);
        } else {
            System.out.println(
                    "FAIL: " + label + " expected " + expected
                            + " but got nested=" + nestedResult + ", set=" + setResult);
        }
    }
}