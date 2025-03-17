package in.kgcoding.challenge39;

class bankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public bankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public void depositMoney(double money){
        if(money <=0){
            System.out.println("invalid deposit");
        }else {
            balance += money;
        }
    }

    public double withdrawMoney(double money){
        if (money <=0){
            System.out.println("invalid withdraw");

        }else if (balance >= money ){
            balance-=money;
        }else {
            money = balance;
            balance = 0;
        }

        return money;
    }
}
