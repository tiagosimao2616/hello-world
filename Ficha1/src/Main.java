public class Main {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        float per = calculateRectanglePerimeter(5,10);
        System.out.println("Perimetro do retangulo é: " + per);
        float vol = calculateObjectVolume(5,10,20);
        System.out.println("Volume é: " + vol);
        float cel = convertFahrenheitToCelsius(100);
        System.out.println("A conversao de fr para celsius: " + cel);
        int tim = convertTimeToSeconds(3,43,22);
        System.out.println("A conversao das horas é: " + tim + " segundos.");
        int[] array = {15,34,5,7};
        int minimum = minimumOfArray(array);
        int maximum = maximumOfArray(array);
        float average = averageOfArray(array);

    }

    //11:
    private static float averageOfArray(int[] array) {

    }
    private static int maximumOfArray(int[] array) {
        int maximum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maximum)
                maximum = array[i];
        }
    }

    private static int minimumOfArray(int[] array) {
        int minimum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimum)
                minimum = array[i];
        }
    }

    //7:
    public static float calculateRectanglePerimeter(float height, float width){
           float perimeter = 2 * (height + width);
           return perimeter;
    }
    //8:
    public static float calculateObjectVolume(float height, float width, float length){
        float volume = height * width * length;
        return volume;
    }
    //9:
    public static float convertFahrenheitToCelsius(float fr){
        float c = (fr - 32) * 5/9;
        return c;
    }
    //10:
    public static int convertTimeToSeconds(int hours, int minutes, int seconds){
        int time = (hours * 3600) + (minutes * 60) + seconds;
        return time;
    }
    //11:

}

