public class TypeCasting {
    public static void main(String[] args) {
        
        double num = 9.78;
        int castNum = (int) num;

        int a = 5;
        double b = a;

        System.out.println( "Explicit cast:" + castNum);
        System.out.println("Implicit cast:" + b);
    }
    
}
