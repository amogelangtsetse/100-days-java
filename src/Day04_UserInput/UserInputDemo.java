package Day04_UserInput;

import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter your height in centimters:");
        double height = scanner.nextDouble();

        System.out.println("Hello" + name + ", age" + age + ", height" + height + "cm");

        scanner.close();
    }
    
}
