package bank;

public class Bank {

    // 계좌에 있는 돈
    public int cutomerMoney = 1000;
    private int cutomerMoney1 = 1500;

    // 변수의 조회를 가능하게하는 메소드
    public int checkCustomerMoney() {
        return cutomerMoney1;
    }

    // 송금을 할 수 있는 메소드
    public void transferMoney(int cutomerMoney) {
        /**
         * 여기에서 문제점은 두개의 메소드가 public이기 때문에
         * 어디에서든지 접근 할 수 있다.
         * 외부에서 접근 할 수 있기 때문에 외부에서 접근 할 수 있다.
         * 외부에서만 사용하는 변수는 private으로 잠궈야 한다.
         */
        if (cerificate() == true) {
            if (otp() == true) {
                System.out.println("송금");
            }
        }
    }

    // 계좌에 접근 할 수 있는 가상의 본인 인증 메소드
//    public boolean cerificate() {
//        return true;
//    }
//
//    // 가상의 otp 메소드
//    public boolean otp() {
//        return true;
//    }

    private boolean cerificate() {
        return true;
    }

    // 가상의 otp 메소드
    private boolean otp() {
        return true;
    }

}
