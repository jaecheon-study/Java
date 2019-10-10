public class While {

    public static void main(String[] args) {

        boolean hungry = true;

        // 빠져나오는 조건이 없으니 무한루프
//        while(hungry == true) {
//            System.out.println("돈까스 먹는다.");
//        }

        // break 종료
        while(hungry == true) {
            System.out.println("돈까스 먹는다.");
            System.out.println("돈까스 먹는다.");
            System.out.println("돈까스 먹는다.");
            System.out.println("돈까스 먹는다.");
            System.out.println("돈까스 먹는다.");
            System.out.println("\n");
            break;
        }

        while (hungry == true) {
            System.out.println("돈까스 먹는다.");
            System.out.println("돈까스 먹는다.");
            System.out.println("돈까스 먹는다.");
            System.out.println("돈까스 먹는다.");
            System.out.println("돈까스 먹는다.");
            System.out.println("\n");
            hungry = false;
            // continue는 다시 while으로 돌아가 조건을 확인한다. 즉 밑에 코드는 실행하지 않음
            continue;
        }

    }

}
