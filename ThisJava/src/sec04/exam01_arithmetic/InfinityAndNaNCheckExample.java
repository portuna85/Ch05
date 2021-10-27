package sec04.exam01_arithmetic;

public class InfinityAndNaNCheckExample {
    public static void main(String args[]) {
        int x = 5;
        double y = 0.0;

        double z = 5 / y;
        System.out.println(Double.isInfinite(z));

        System.out.println(z + 2);
        if(Double.isInfinite(z) || Double.isNaN(z)) {
            System.out.println("산출 불가");
        } else {
            System.out.println(z + 2);
        }
    }
}
