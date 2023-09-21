public class NumericalUtilities {
    public static float powerOf(float base, float exp){
        float result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }
    public static int sumOfNaturalNumbersUpTo(int num) {
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumOfNaturalNumbersBetween(int num1, int num2) {
        int sum = 0;
        for (int i = num1; i <= num2; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumOfEvenNumbersBetween(int num1, int num2) {
        int sum = 0;
        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static int numberOfDivisorsOf(int num) {
        int div = 0;
        for (int i = 1; i <= num ; i++) {
            if (num%i == 0) {
                div++;
            }
        }
        return div;
    }

    public static boolean isPrime(int num) {
        if (numberOfDivisorsOf(num)==2) {
            return true;
        }
        else {
            return false;
        }
    }
}
