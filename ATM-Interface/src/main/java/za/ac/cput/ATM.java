package za.ac.cput;


import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        System.out.println("Welcome to Lwethu's ATM: ");
        System.out.println("Please enter your User ID: ");
        String userId = sc.nextLine();
        System.out.println("Please enter your Password: ");
        String password = sc.nextLine();

        User currentUser = bank.authenticate(userId, password);
        if (currentUser == null) {
            System.out.println("Invalid credentials. Exiting.");
            return;
        }

        ATMOperations operations = new ATMOperations(currentUser, bank);
        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Transaction History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    operations.showHistory();
                    break;
                    case 2:
                        System.out.println("Please enter amount to withdraw: ");
                        double amount = sc.nextDouble();
                        operations.withdraw(amount);
                        break;
                        case 3:
                            System.out.println("Please enter amount to deposit: ");
                            double dAmount = sc.nextDouble();
                            operations.deposit(dAmount);
                            break;
                            case 4:
                                sc.nextLine();
                                System.out.println("Please enter your ID: ");
                                String id = sc.nextLine();
                                System.out.println("Please enter amount to transfer: ");
                                double amount2 = sc.nextDouble();
                                operations.transfer(id, amount2);
                                break;
                                case 5:
                                    System.out.println("Thank you for using Lwethu's ATM.");
                                    sc.close();
                                    return;
                                    default:
                                        System.out.println("Invalid choice. Exiting.");

            }
        }

        }
    }