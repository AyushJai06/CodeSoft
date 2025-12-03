import java.util.Scanner;
class UserAccount {
    protected double balance;
    public UserAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        }
    }
    public double Balance() {
        return balance;
    }
}
class ATM extends UserAccount {
    Scanner sc = new Scanner(System.in);
     public ATM(double initialBalance) {
        super(initialBalance);
    }
    public void showMenu() {
        while (true) {
            System.out.println("\n===== ATM Menu =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Current Balance: " + Balance());
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    deposit(sc.nextDouble());
                    break;
                    case 3:
                    System.out.print("Enter withdrawal amount: ");
                    withdraw(sc.nextDouble());
                    break;
                    case 4:
                    System.out.println("Thank you for using the ATM!");
                    return;
                    default:
                    System.out.println("Please enter a valid choice!!");
            }
        }
    }
}
public class AtmInterface {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a initial amount for the account:");
        int ib=sc.nextInt();
        ATM atm = new ATM(ib);
        atm.showMenu(); 
    }
}
