// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
package pt.uma.tpsi.ad;

public class NumericalUtilities {

    public static float powerOf(float base, float exp){
        float result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result
    }

}