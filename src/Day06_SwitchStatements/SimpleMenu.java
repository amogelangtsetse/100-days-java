package Day06_SwitchStatements;

import java.util.Scanner;

public class SimpleMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose an option");
        System.out.println("1. View Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");

        int choice = scanner.nextInt();

        switch (choice){
            case 1: 
            System.out.println("Balance: R5000");
            break;
            case 2:
            System.out.println("Deposit selected");
            break;
            case 3:
            System.out.println("Withdraw selected");
            break;
            default:
            System.out.println("Invalid option");
            
        }

        scanner.close();
    }
    
}
