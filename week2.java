import java.io.*;
import java.util.*;

public class Anagrams { 

    public static char anagrams( String a, String b )
    {
      a = a.toLowerCase();
      b = b.toLowerCase();
      HashMap<Character, Integer> firstWord = new HashMap<Character, Integer>();
      HashMap<Character, Integer> secondWord = new HashMap<Character, Integer>();

    for (int i = 97; i <= 122; i++){
      firstWord.put( (char) i, 0 );
      secondWord.put( (char) i, 0 );
    }

      char[] firstWordArray = a.toCharArray();
      char[] secondWordArray = b.toCharArray();
      

      for (int i = 0; i < a.length(); i++) {
        int valueof = firstWord.get(firstWordArray[i]) + 1;
        firstWord.put(firstWordArray[i] , valueof );
      }

      for (int i = 0; i < b.length(); i++) {
        int valueof = secondWord.get(secondWordArray[i]) + 1; 
        secondWord.put(secondWordArray[i] , valueof );
      }

      boolean anaMatches = true;
      char missingLetter = 'a';

      for( int i = 1; i < 27; i++) {
        char onechar = (char)(i+96);
        if (firstWord.get(onechar) != secondWord.get(onechar)) {
          anaMatches = false;
          int tempNum = i + 96;
          missingLetter = (char)tempNum;
      }}

      if (!anaMatches) {
      // System.out.println("Missing: " + missingLetter);
      return missingLetter;
      }
      else return '!';

    }

    public static void main( String[] args ) 
    { 
      
      System.out.println(Anagrams.anagrams("Roam", "Roman"));
    }
}
