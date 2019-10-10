public class Method {

    // 메소드의 이름은 유니크.
    public int plus(int a, int b) {
        int result;
        result = a + b;
        return result;
    }

    public void plus1(int a, int b) {
        int result;
        result = a + b;
    }

    public static void main(String[] args) {
        new Method().plus(10, 20);
        new Method().plus1(30, 40);

        int number1;
        int number2;
        int number3;

        number1 = new Method().plus(100, 100);
        number2 = new Method().plus(50, 50);

        // 리턴 값을 가지지 않는 메소드이기 때문에 변수에 할당 할 수 없다.
//        number3 = new Method().plus1(50, 40);

        System.out.println(number1);
        System.out.println(number2);

    }
}
