package interface_exam;

public class MakeCalculator implements Calculator {
    /**
     * 계산기 클래스를 만드는 개발자는 명세화된 인터페이스를 바탕으로
     * 해당 기능을 구현한다. 그 뒤 어떻게 작동 될 것인지
     * 세부적인 작성을 시작하면된다.
     */
    @Override
    public void sum() {
        System.out.println("더하기");
    }

    @Override
    public void minus() {
        System.out.println("빼기");
    }

    @Override
    public void div() {
        System.out.println("나누기");
    }

    @Override
    public void multiple() {
        System.out.println("곱하기");
    }
}
