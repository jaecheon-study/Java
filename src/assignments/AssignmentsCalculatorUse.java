package assignments;

public class AssignmentsCalculatorUse {
    public static void main(String[] args) {
        AssignmentsCalculator calculator = new AssignmentsCalculator(10);
        calculator.add(3);
        calculator.getResult();
        calculator.multiple(2);
        calculator.getResult();
        calculator.percent(4);
        calculator.getResult();
        calculator.minus(5);
        calculator.getResult();
    }
}
