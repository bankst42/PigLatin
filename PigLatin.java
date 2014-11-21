import java.util.*;
import java.lang.*;
public class PigLatin
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    String out = pigLatinize(str);
    System.out.println(out);
  }
  
  public static String pigLatinize(String str)
  {
    int i = 0;
    String translated = "";
    while(i <= str.length())
    {
      if (str.indexOf(" ", i) < 0)
      {
        String word = str.substring(i);
        translated = translated + " " + translate(word) + ".";
        break;
      }
      else
      {
        String word = str.substring(i, str.indexOf(" ", i));
        translated = translated + " " + translate(word);
      }
      
      i = str.indexOf(" ", i) + 1;
    }
    return translated;
  }
  
  public static String translate(String word)
  {
    if (word.substring(0, 1).compareTo("a") != 0 && word.substring(0, 1).compareTo("e") != 0 && word.substring(0, 1).compareTo("i") != 0 && word.substring(0, 1).compareTo("o") != 0 && word.substring(0, 1).compareTo("u") != 0)
    {
      return word.substring(1) + word.substring(0, 1) + "ay";
    }
    return word + "ay";
  }
}
     