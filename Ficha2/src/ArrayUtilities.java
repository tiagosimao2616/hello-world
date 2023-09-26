public class ArrayUtilities {

    public static String toString(int[] array) {
        String str = "Array: [";
        for (int i = 0; i < array.length; i++) {
           if(i < array.length-1)
            str += array[i] + ",";
           else
            str+=array[i];
        }
        //"Array: [2,4,5,6,7]"
        str += "]";
        return str;
    }

    public static int maximumOf(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
           if (array[i]>max)
               max = array[i];
        }
        return max;
    }

    public static int[] copyOf (int[] array) {
       int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    public static int minimumOf(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]<min)
                min = array[i];
        }
        return min;
    }

    public static boolean contains(int[] array,int value) {
        for (int i = 0; i < array.length; i++) {
          if (array[i]==value)
              return true;
        }
        return false;
    }

    public static boolean containsDuplicates(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length+1; j++) {
                if (array[i] == array[j] && i != j)
                    return true;
            }
        }
        return false;
    }


    public static int indexOf(int[] array, int value) {
        int indice = -1;
        for (int j = 0; j < array.length; j++) {
            if (array[j]==value)
                indice = array[j];
        }
        return indice;
    }

    public static int add(int[] array, int value) {
        int [] array1 = [];
        return array1
    }
}
