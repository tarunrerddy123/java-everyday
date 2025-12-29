import java.util.*;
public class StringComparisonScanner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The First Word:");
        String s1 = sc.next();
        System.out.print("Enter The Second Word:");
        String s2 = sc.next();
        System.out.println(s1.equals(s2));
    }
}
