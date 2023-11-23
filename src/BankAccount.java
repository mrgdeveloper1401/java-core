public class BankAccount {
    public String name;
    final int account_number;
    public double amount;

    public BankAccount(String name, int account_number, double amount){
        this.name = name;
        this.account_number = account_number;
        this.amount = amount;
    }

    public void withdraw(double withdrawalAmount){
        if(withdrawalAmount > amount){
            System.out.println("Insufficient inventory");
        } else {
            amount -= withdrawalAmount;
        }
    }

    public void increase(double increaseAmount){
        amount += increaseAmount;
    }
}
