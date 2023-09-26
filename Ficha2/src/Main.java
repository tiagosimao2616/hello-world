// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static void main(String[] args) {
        /*float base = 2.0f;
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
        System.out.println(prime); */

        int[] array = {3,7,9,10,1,2};
        String str = ArrayUtilities.toString(array);
        System.out.println(str);

        int maxarray = ArrayUtilities.maximumOf(array);
        System.out.println(maxarray + " " + ArrayUtilities.toString((array)));


        int minarray = ArrayUtilities.minimumOf(array);
        System.out.println(minarray + " " + ArrayUtilities.toString((array)));

        System.out.println(ArrayUtilities.toString((ArrayUtilities.copyOf(array))));

        boolean cont = ArrayUtilities.contains(array,5);
        System.out.println(cont);

        boolean rep = ArrayUtilities.containsDuplicates(array);
        System.out.println(rep);

        int indice = ArrayUtilities.indexOf(array,8);
        System.out.println(indice);

        int[] value = ArrayUtilities.add(array,8);
        System.out.println(ArrayUtilities.toString(value));

        int[] indice1 = ArrayUtilities.remove(array,11);
        System.out.println(ArrayUtilities.toString(indice1));
    }
}