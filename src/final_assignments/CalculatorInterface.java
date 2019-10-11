package final_assignments;

// 계산기
public interface CalculatorInterface {
    /**
     * 송금 할 때 더할 메소드
     * @return
     */
    public int sum(int first, int second);

    /**
     * 출금 할 때 뺄 메소드
     * @return
     */
    public int minus(int first, int second);

}
