public class Switch {

    public static void main(String[] args) {

        int money = 5000;
        switch (money) {
            case 10000:
                System.out.println("돈까스");
                break;
            case 5000:
                System.out.println("국밥");
                break;
            case 1000:
                System.out.println("떡볶이");
                break;
            default:
                System.out.println("굶음");
                break;
        }
    }
}
