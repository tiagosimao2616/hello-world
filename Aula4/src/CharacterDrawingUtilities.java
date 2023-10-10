public class CharacterDrawingUtilities {
    public static void drawElement(char c){
        System.out.print(c);
    }

    public static void drawNewLine(){
        System.out.println();
    }

    public static void drawHorizontalSegmentWith(char c, int width){
        for (int i = 0; i < width; i++) {
            drawElement(c);
        }
    }

    public static void drawFilledRectangleWith(char c, int height, int width){
        for (int i = 0; i < height; i++) {
            drawHorizontalSegmentWith(c, width);
        }
    }
}
