public class LowerUpperCase {
    public static void main(String[] args){
        String s1 = new String("java world");
//        System.out.println(s1.toUpperCase());
//        System.out.println(s1.toLowerCase());
//        System.out.println(s1.trim());
        System.out.println(s1.startsWith("ja"));
        System.out.println(s1.endsWith("rd"));
        System.out.println(s1.contains("java world"));
    }
}
