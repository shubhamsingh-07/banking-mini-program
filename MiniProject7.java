import java.util.Scanner;

public class MiniProject7 {
    static Scanner scanner = new Scanner(System.in);  //GLOBAL VAR. should be static; no change w.r.t local var.

    public static void main(String[] args) {
        //BANKING PROGRAM (BEGINNER)

        double balance = 1;
        int choice = 0;

        boolean isRunning = true;

        while (isRunning) {
            System.out.print("\n1. showBalance");
            System.out.print("\n2. Deposit");
            System.out.print("\n3. Withdraw");
            System.out.print("\n4. Exit");
            System.out.print("\nEnter the choice(1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> {
                    double amount = withdraw();
                    if(amount > balance){
                        System.out.print("\nInsufficient Balance");
                    }
                     balance -= amount;
                }
                case 4 -> {
                    System.out.println("Thank you!");
                isRunning = false;
                }
                default -> System.out.println("INVALID CHOICE");
            }
        }
        scanner.close();
    }
        static void showBalance(double balance){                      //void is used cuz no return value
            System.out.printf("%.2f", balance);
        }
        static double deposit(){                                      // returned an amount in the method deposit();
        double amount;
        System.out.print("Enter the amount to be deposited: ");
        amount = scanner.nextDouble();
        if(amount < 0){
            System.out.printf("Amount cannot be negative");
        }
        else{
            System.out.printf("Deposited amount : %.2f", amount);
        }
        return amount;
        }
        static double withdraw() {                                  //returned an amount in the method withdraw();
            double amount;
            System.out.print(" Enter the amount to be withdrawn: ");
            amount = scanner.nextDouble();
            if (amount < 0) {
                System.out.println("Amount should not be negative");
                return 0;
            } else {
                System.out.printf("Withdrawn Amount: %.2f", amount);
                return amount;
            }
        }
}

