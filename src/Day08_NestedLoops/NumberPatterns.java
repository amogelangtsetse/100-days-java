package Day08_NestedLoops;

public class NumberPatterns {
    public static void main(String[] args) {
        
        System.out.println("Pattern 1: Increasing numbers");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
            System.out.print(j + "");
            }
            System.out.println();
        }
        System.out.println("\nPattern 2: Decreasing numbers");
        for (int i = 5; i >= 1; i--){
            for (int j = 1; j <= i; j++) {
                System.out.println(j + "");
            }
            System.out.println();
        }
        System.out.println("\nPattern 3: Right-aligned triangle");
    for (int i = 1; i <= 5; i++) {
        for (int space = 1; space <= 5 - i; space++) {
        System.out.print("  ");
    }
        for (int num = 1; num <= i; num++) {
        System.out.print(num + " ");
    }
    System.out.println();
}
    }
}
