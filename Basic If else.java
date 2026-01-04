public class Demo {
    public static void main(String [] args) {
        int x = 2;
        int y = 4;
        int z = 5;
        if (x > y && x > z)
            System.out.println("The Greatest is: " + x);
        else if (y > x && y > z)
            System.out.println("The Greatest is: " + y);
        else
            System.out.println("The Greatest is: " + z);
    }
}
