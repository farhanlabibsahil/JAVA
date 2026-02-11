import java.util.Scanner;

public class LotteryGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter A Two Digit Number:");
        int num = sc.nextInt();
        if (num >= 0 && num < 100) {
            int rnum = (int) (Math.random() * 100);
            int num1 = num / 10;
            int num2 = num % 10;
            int rnum1 = rnum / 10;
            int rnum2 = rnum % 10;
            System.out.printf("Lottery number is: %02d%n", rnum);
            if (num == rnum) {
                System.out.println("Exact match! You win $10,000");
            } else if (num1 == rnum2 && num2 == rnum1) {
                System.out.println("All digits match! You win $3,000");
            } else if (num1 == rnum1 || num1 == rnum2 || num2 == rnum1 || num2 == rnum2) {
                System.out.println("One digit matches! You win $1,000");
            } else {
                System.out.println("Sorry, no match");
            }
        }
         else {
            System.out.println("Please Enter A Number Between 00-99");
        }
        sc.close();
    }
}
