package final_assignments;

public class Main {

    public static void main(String[] args) {

        Account guestAccount = new Account(1000);
        // 손님의 계좌를 넣어준다.
        Guest guest = new Guest(guestAccount);
        Teller teller = new Teller();

        teller.save(guest.account, 5000);
        int result = guest.checkAccount();
        System.out.println(result);

        teller.withdraw(guest.account, 5000);
        int result2 = guest.checkAccount();
        System.out.println(result2);

    }

}
