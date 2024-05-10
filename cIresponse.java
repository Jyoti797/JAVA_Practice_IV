import java.lang.Math;

public class cIresponse {
    public static void main(String[] args) {
        int p = 10000;
        int t = 7;
        int r = 15;
        double y = (100 + r);
        double z = y / 100;

        double a = p * Math.pow(z, t);
        int amount = (int) a;
        int ci = amount - p;
        System.out.println("Amount after " + t + " years is " + amount);
        System.out.println("Compound interest after " + t + " years is " + ci);

    }

}
