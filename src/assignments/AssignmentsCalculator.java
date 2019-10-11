package assignments;

public class AssignmentsCalculator {

    int result;

    public AssignmentsCalculator(int result) {
        this.result = result;
    }

    public void add(int value){
        result += value;
        negativeNumber();
    }

    public void multiple(int value) {
        result *= value;
        negativeNumber();
    }

    public void percent(int value) {
        result %= value;
        negativeNumber();
    }

    public void div(int value) {
        result /= value;
        negativeNumber();
    }

    public void minus(int value) {
        result -= value;
        negativeNumber();
    }

    public void negativeNumber() {
        if (result < 0) {
            result = 0;
        }
    }

    public void getResult() {
        System.out.println(result);
    }
}
