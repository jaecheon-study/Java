public class For {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("돈까스 먹는다." + " " + (i+1) + " 번째");
        }

        System.out.println("\n");

        for (int i = 0; i < 10; i++) {
            System.out.println("돈까스 먹는다." + " " + (i+1) + " 번째");
            if (i == 5) {
                break;
            }
        }

    }
}
