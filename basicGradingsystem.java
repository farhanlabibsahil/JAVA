import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x;

        System.out.print("Enter Your Marks: ");
        x = sc.nextInt();

        if (x >= 80)
            System.out.println("Your Grade is A");
        else if (x >= 70)
            System.out.println("Your Grade is B");
        else if (x >= 60)
            System.out.println("Your Grade is C");
        else if (x >= 50)
            System.out.println("Your Grade is D");
        else
            System.out.println("Your Grade is F");
    }
}
