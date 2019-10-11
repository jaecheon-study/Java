package assignments;

import java.util.ArrayList;

public class AssignmentsArrayListThree {

    public static int multipleTwoArrayLists(ArrayList<Integer> ints, ArrayList<Integer> ints1) {

        int count = 0;

        for (int i = 0; i < ints.size(); i++) {
            count = ints.get(i) * ints1.get(i);
            System.out.println(count);
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        ArrayList<Integer> ints1 = new ArrayList<>();

        for (int i = 0; i <= 9; i++) {
            ints.add(i);
        }

        for (int i = 9; i >= 0; i--) {
            ints1.add(i);
        }

        multipleTwoArrayLists(ints, ints1);
    }
}
