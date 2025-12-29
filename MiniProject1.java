import java.util.*;
public class MiniProject1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        for(int i =1; i<4;i++){
            System.out.println("STUDENT"+i);
            System.out.print("Enter Your Name of student"+i+":");
            String name = scan.next();
            System.out.print("Enter Your Age: ");
            int age = scan.nextInt();
            System.out.print("Enter your English Marks:");
            int marks = scan.nextInt();
            System.out.print("Enter Your Maths Marks");
            int marks1 = scan.nextInt();
            double avg = (marks + marks1)/2;
            System.out.println("Avarage Marks:"+avg);

        }
    }
}
