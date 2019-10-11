package assignments;

import java.util.ArrayList;

public class AssignmentsArrayListTwo {

    public static int howManyOdds(ArrayList<Integer> ints) {

        int count = 0;

        for (int i = 0; i <= 9; i++) {
            if (ints.get(i) % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        ArrayList<Integer> ints = new ArrayList<>();

        for (int i = 0; i <= 9; i++) {
            ints.add(i);
        }
        System.out.println(howManyOdds(ints));

    }
}
