public class ImplicitCasting {
    public static void main(String[] args) {

        int a = 10;
        double b = a;   // implicit casting

        System.out.println("Int value: " + a);
        System.out.println("Double value: " + b);

        char ch = 'A';
        int ascii = ch; // char → int

        System.out.println("Char value: " + ch);
        System.out.println("ASCII value: " + ascii);
    }
}
