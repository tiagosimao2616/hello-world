public class Main {

   public static void main(String[] args){

      char c ='c';
      char var = CharacterUtilities.lowerLetterSuccessorOf(c);
      System.out.println(var);

      char last = CharacterUtilities.lowerLetterPredecessorOf(c);
      System.out.println(last);

      char n = CharacterUtilities.lowerLetterSuccessorStepsOf(c,2);
      System.out.println(n);

      char p = CharacterUtilities.lowerLetterPredecessorStepsOf(c,2);
      System.out.println(p);

      char[] array = {'a','b','t','c','s','c'};


      int quant = CharacterUtilities.occurrencesOfCharacterIn(array,c);
      System.out.println(quant);

      char x = 'x';
      char[] carray = CharacterUtilities.replaceCharacterIn(array,c,x);
      System.out.println(carray);
   }


}