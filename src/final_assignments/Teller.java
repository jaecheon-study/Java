package final_assignments;

import interface_exam.Calculator;

// 은행원
public class Teller {
    // 출금 또는 입금 기능 진행

    public Teller() {

    }

    public void save(Account account, int savingMoney) {
        // 기존 계좌에서 들어온 돈을 더함
        account.money += savingMoney;
    }

    public void withdraw(Account account, int money) {
        // 기존 계좌에서 들어온 돈을 뺌
        account.money -= money;
    }
}
