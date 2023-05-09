import java.util.UUID;

public class HdfcBankAccount implements BankAccount{

    private  String accountNumber;
    private  int balance;
    private int roi;

    public HdfcBankAccount(int balance) {
        this.balance = balance;
        this.accountNumber= String.valueOf(UUID.randomUUID());
        this.roi=5;
    }



    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    @Override
    public Boolean withdrwaMoney(int money) {
        return null;
    }

    @Override
    public Boolean addMoney(int money) {
        return null;
    }

    @Override
    public int checkBalnace() {
        return this.balance;
    }

    @Override
    public int getRDI() {
        return this.roi;
    }

    @Override
    public int getTotalInterest(int amount, int year) {
        return amount*year/roi;
    }

}
