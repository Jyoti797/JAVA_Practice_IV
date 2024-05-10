public class primeNum {
    public static void main(String[] args) {
        int range = 100;
        for (int i = 2; i <= range; i++) {
            if (isPrime(i)) {
                int[] basket = i;
            }
        }
    }

    public static boolean isPrime(int num) {
        int count = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                count = count + 1;
        }

        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }

}
