public class ExplicitCasting {
    public static void main(String[] args) {

        double x = 10.75;
        int y = (int) x;   // explicit casting

        System.out.println("Double value: " + x);
        System.out.println("Int value: " + y);

        int num = 130;
        byte b = (byte) num;  // data loss example

        System.out.println("Int value: " + num);
        System.out.println("Byte value: " + b);
    }
}
