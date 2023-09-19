// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static void main (String[] args) {
        float  base = 2.0f;
        float  exp = 3.0f;
        float  res = NumericalUtilities.powerOf(base,exp);
        System.out.println(base + "power of " + exp + " is: " + res);
        System.out.println(String.format("%f power of %f ", base, exp, res));
    }


}