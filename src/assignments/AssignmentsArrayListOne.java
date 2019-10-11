package assignments;

import java.util.ArrayList;

public class AssignmentsArrayListOne {
    public static void main(String[] args) {

        ArrayList<Integer> ints = new ArrayList<>();
        ArrayList<Boolean> result = new ArrayList<>();

        for (int i = 0; i <= 9; i++) {
            ints.add(i);
        }

        System.out.println(ints);

        for (int i = 0; i < ints.size(); i++) {
            if (ints.get(i) < 5) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        System.out.println(result);
    }
}
