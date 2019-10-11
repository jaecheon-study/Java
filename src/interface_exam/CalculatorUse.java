package interface_exam;

/**
 * 계산기 클래스를 사용해서 개발할 개발자는
 * 계산기 클래스가 만들어지기 까지 가짜 계산기 클래스를 만든다.
 */
public class CalculatorUse {
    public static void main(String[] args) {

        // 가짜 계산기 클래스
        FakeCalculator fakeCalculator = new FakeCalculator();

        fakeCalculator.sum();
        fakeCalculator.minus();
        fakeCalculator.div();
        fakeCalculator.multiple();

        // 진짜 계산기 클래스가 완료된 후 가짜 계산기 클래스를 진짜 계산기 클래스로 변경한다.
        MakeCalculator calculator = new MakeCalculator();

        calculator.sum();
        calculator.minus();
        calculator.div();
        calculator.multiple();

    }
}
