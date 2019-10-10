public class Array {

    public static void main(String[] args) {

        boolean[] booleans = new boolean[4];
        int[] ints = new int[4];

        // 배열의 크기를 지정하지 않으면
        // Array initializer expected 에러
//        int[] ints1 = new int[];

        boolean[] booleans2 = {true, false, true, false};
        // 배열이 생성된 주소 값 (메모리 주소)
        System.out.println(booleans2);

        int[] ints1 = {1, 2, 3, 4};

        // 배열 값 넣기
        booleans[0] = true;
        booleans[1] = false;
        booleans[2] = false;
        booleans[3] = true;

        /*
        * 배열 값은 4개인데 5개로 범위를 벗어나면
        * java.lang.ArrayIndexOutOfBoundsException 에러가 난다.
        * */
//        booleans[4] = true;

        // 배열 값 얻기
        int first = ints1[0];
        int second = ints1[1];
        int third = ints1[2];
        int fourth = ints1[3];

        System.out.println(first+ " " + second + " " + third + " " + fourth);

        for (int i = 0; i < booleans.length; i++) {
            if (booleans[i] == true) {
                System.out.println("참");
            } else {
                System.out.println("거짓");
            }
        }

        for (int i = 0; i < ints1.length; i++) {
            if (ints1[i] == 1) {
                System.out.println("1");
            } else if (ints1[i] == 2) {
                System.out.println("2");
            } else {
                System.out.println("알 수 없는 수");
            }
        }

    }

}
