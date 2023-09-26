public class CharacterUtilities {
    public static char lowerLetterSuccessorOf(char current) {
        if (current != 'z')
            return ++current;
        else
            return 'a';
    }

    public static char lowerLetterPredecessorOf(char current) {
        if (current != 'a')
            return --current;
        else
            return 'z';
    }

    public static char lowerLetterSuccessorStepsOf(char current, int value) {
        for (int i = 0; i < value; i++) {
            current = lowerLetterSuccessorOf(current);
        }
        return current;
    }

    public static char lowerLetterPredecessorStepsOf(char current, int value) {
        for (int i = value; i > 0; i--) {
            current = lowerLetterPredecessorOf(current);
        }
        return current;
    }


    public static int occurrencesOfCharacterIn(char[] array, char current) {
        int rep = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==current)
                rep += 1;
        }
        return rep;
    }

    public static char[] replaceCharacterIn(char[] array, char current, char replace) {
        char[] newArray = new char[array.length];
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != current){
                newArray[x] = array[i];
            }
            else {
                newArray[x] = replace;
            }
        }
        return newArray;
    }
}
