package Day09_NestedLoops2;

public class LoopPatterns {
    public static void main(String[] args) {
        System.out.println("Multiplication Table (1 to 5):");

        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++ ){
                System.out.print((i * j) + "\t");
                
            }
            System.out.println();
        }

        System.out.println("\nNumber Pyramid:");
        int rows = 5;
        for (int i = 1; i <= rows; i++){
            for (int space = 1; space <= rows - i; space++){
                System.out.print(" ");
            }

            for (int num = 1; num <= (2 * i -1); num++){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    
}
