package in.kgcoding.challenge39;

public class Customer {
    public static void main(String[] args) {
        bankAccount account = new bankAccount("001", "bhojraj sahu");
        account.depositMoney(100);
        System.out.println(account.withdrawMoney(200));
        account.depositMoney(-40);
        account.withdrawMoney(0);

    }
}

