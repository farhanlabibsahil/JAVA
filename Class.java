class Calc {
    int multi(int m, int n) { //Behaviour 
        int r1=m * n;
        return r1;
    }
}

public class Demo {
    public static void main(String[] args) {
        int n1 = 2, n2 = 3;

        Calc cal = new Calc(); // object declare
        int r = cal.multi(n1, n2);

        System.out.println(r);
    }
}
