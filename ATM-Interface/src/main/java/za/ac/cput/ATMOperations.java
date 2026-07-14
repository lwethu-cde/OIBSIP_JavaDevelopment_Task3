package za.ac.cput;

public class ATMOperations {
    private User user;
    private Bank bank;

    public ATMOperations(User user, Bank bank) {
        this.user = user;
        this.bank = bank;
    }

    public void withdraw(double amount) {
        if(amount > user.getBalance()) {
            System.out.println("Insufficient Balance");
        }else {
            user.setBalance(user.getBalance() - amount);
            user.addTransaction(new Transaction("Withdraw", amount).toString());
            System.out.println("Withdraw successful. New balance: R" + user.getBalance());

        }
    }

    public void deposit(double amount) {
        user.setBalance(user.getBalance() + amount);
        user.addTransaction(new Transaction("Deposit", amount).toString());
        System.out.println("Deposit successful. New balance: R" + user.getBalance());
    }

    public void transfer(String userId, double amount) {
        if(amount > user.getBalance()) {
            System.out.println("Insufficient Balance");
        }else{
            user.setBalance(user.getBalance() - amount);
            user.addTransaction(new Transaction("Transfer", amount).toString());
            System.out.println("Transfer successful. New balance: R" + user.getBalance());
        }
    }

    public void showHistory() {
        user.showTransactionHistory();
    }
}
