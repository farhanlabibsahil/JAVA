import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Weight;
        double Height;
        int Age;
        System.out.println("Please Enter Your Age (In Years):");
        Age = sc.nextInt();
        if (Age >= 20) {
            System.out.println("Please Enter Your Weight (In lbs):");
            Weight = sc.nextDouble();
            System.out.println("Please Enter Your Height (In Inches):");
            Height = sc.nextDouble();
            double wkg = Weight * 0.45359237;
            double hMtr = Height * 0.0254;
            double BMI = wkg / (hMtr * hMtr);
            if (BMI < 18.5) {
                System.out.println("Underweight");
            } else if (BMI >= 18.5 && BMI < 25.0) {
                System.out.println("Normal");
            } else if (BMI >= 25.0 && BMI < 30.0) {
                System.out.println("Overweight");
            } else {
                System.out.println("Obese");
            }
        } else
            System.out.println("This Calculator is only for People with 20 Years or Older ");
        sc.close();
    }
}
