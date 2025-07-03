package Day07_Loops;

public class LoopExamples {
    public static void main(String[] args) {
        
        System.out.println("For Loop: 1-6");
        for (int i = 1; i <=6; i++){
            System.out.println("i="+ i);
        }

        System.out.println("\nWhile Loop: 5 to 1");
        int j = 5;
        while (j >= 1) {
            System.out.println("j = "+ j);
            j--;
        }
        System.out.println( "\nDo-While Loop: 1-3");
        int k = 1;
        do{
            System.out.println("k = "+ k);
            k++;
        } while (k<=3);

    }
    
}
