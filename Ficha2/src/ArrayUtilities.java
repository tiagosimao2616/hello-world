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
            for (int j = 0; j < array.length; j++) {
                if (array[j] == array[i] && i != j)
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

    public static int[] add(int[] array, int value) {
            int[] newArray = new int[array.length+1];
        int x = 0;
        for (int j = 0; j < array.length; j++) {
                newArray[j] = array[j];
        }
        newArray[newArray.length-1] = value;
        return newArray;
    }

    public static int[] remove(int[] array, int value) {
        if (contains(array,value)){
                int[] newArray = new int[array.length - 1];
                int x = 0;
                for (int j = 0; j < array.length; j++) {
                    if (array[j] != value) {
                        newArray[x] = array[j];
                        x++;
                    }
                }
                return newArray;
        }
        else
            return array;
    }
}
