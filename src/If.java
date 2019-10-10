public class If {

    public static void main(String[] args) {

        int money = 5000;

        if (money >= 10000) {
            System.out.println("돈까스");
        }

        if (money >= 10000) {
            System.out.println("돈까스");
        } else {
            System.out.println("국밥");
        }

        if (money >= 10000) {
            System.out.println("돈까스");
        } else if (money >= 5000) {
            System.out.println("국밥");
        } else {
            System.out.println("떡볶이");
        }

    }
}
