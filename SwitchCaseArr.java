public class Demo {
    public static void main(String[] args) {

        int x = 1;
        switch (x) {      // Arrow Doesnt need a break or :
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");

            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");

            case 5 -> System.out.println("Thursday");

            case 6 -> System.out.println("Friday");

            case 7 -> System.out.println("Saturday");

            default -> System.out.println("Enter A Value From 1-7");

        }
    }
}
