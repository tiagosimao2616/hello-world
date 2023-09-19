// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

    public class Main {
        public static void main(String[] args) {
            float base = 2.0f;
            float exp = 3.0f;
            float res = NumericalUtilities.powerOf(base, exp);
            System.out.println(base + "power of " + exp + " is: " + res);
            System.out.println(String.format("%f power of %f ", base, exp, res));

            int sum = NumericalUtilities.sumOfNaturalNumbersUpTo(sum=100);
            System.out.println(String.format("sumOfNaturalNumbersUpTo %d is: %d ",100, sum));

            int sum2 = NumericalUtilities.sumOfNaturalNumbersBetween(40,60);
            System.out.println(sum2);


            int sum3 = NumericalUtilities.sumOfEvenNumbersBetween(40,60);
            System.out.println(sum3);

            int sum4 = NumericalUtilities.numberOfDivisorsOf(4);
            System.out.println(sum4);

            boolean prime = NumericalUtilities.isPrime(4);
        }
    }