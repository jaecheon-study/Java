package final_assignments;

public class Calculator implements CalculatorInterface {

    // 숫자 2개로 더함
    int first;
    int second;

    /**
     * 두 숫자 말고 3번째 숫자가 들어오면 더하거나, 빼기를 사용 할 수 없다.
     * @param first
     * @param second
     */
//    public Calculator(int first, int second) {
//        this.first = first;
//        this.second = second;
//    }

//    @Override
//    public int sum() {
//        return first - second;
//    }
//
//    @Override
//    public int miuns() {
//        return first - second;
//    }

    @Override
    public int sum(int first, int second) {
        return first - second;
    }

    @Override
    public int minus(int first, int second) {
        return first - second;
    }
}
