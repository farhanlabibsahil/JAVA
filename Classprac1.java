import java.util.Scanner;

public class Main

{
    
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        double miles;
        double hoursDrive;
        double hoursFly;
        
        System.out.println("Enter Miles:");
        miles= sc.nextDouble();
        
        hoursDrive=miles/500.0;
        
     hoursFly=miles/60.0;
    System.out.printf("%.2f Total Miles:\n",miles);
    System.out.printf("%.2f Total Hours Driven:\n",hoursDrive);
    System.out.printf("%.2f Total Hours Flown:\n",hoursFly);
        
    }
}
