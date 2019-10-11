package bank;

public class BankUse {

    public static void main(String[] args) {
        Bank bank = new Bank();
        int cutomerMoney = bank.cutomerMoney;
        System.out.println(cutomerMoney);

        /**
         * 확인만 할 수 있는 것이 아니다.
         * 접근이 가능하니 값을 변경 할 수 있다.
         */
        bank.cutomerMoney = 2000;
        System.out.println(bank.cutomerMoney);


        /**
         * private으로 선언한 변수는 접근하지 못하기 때문에
         * 에러가 발생한다.
         */
//        bank.cutomerMoney1 = 1000;

        /**
         * 값을 확인하려면
         * 값을 확인 할 수 있는 메소드를 만들어야 한다.
         */
        System.out.println(bank.checkCustomerMoney());

        // 송금
        bank.transferMoney(cutomerMoney);

    }

}
