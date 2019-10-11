package final_assignments;

public class Guest {

    // 계좌
    Account account;

    public Guest(Account account) {
        this.account = account;
    }

    public int checkAccount() {
        return account.money;
    }
}
