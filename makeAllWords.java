import java.util.List;
import java.util.ArrayList;
public class makeAllWords{
  public static void main(String[] args){
    System.out.println("makeAllWords(1,26): " + makeAllWords(1,26));
    System.out.println("makeAllWords(1,26): " + makeAllWords(2,26));
    System.out.println("makeAllWords(1,26): " + makeAllWords(3,26));
    System.out.println("makeAllWords(1,26): " + makeAllWords(3,3));
    System.out.println("makeAllWords(1,26): " + makeAllWords(4,2));

  }
  public static List<String> makeAllWords(int k, int maxLetter){
    ArrayList<String> toReturn = new ArrayList<String>();
    help(k, maxLetter, "", toReturn);
    return toReturn;
  }
  private static void help(int k, int maxLetter, String word, List<String> toReturn){
    if (k==0){
      toReturn.add(word);
    }else{
      for (int i = 0; i < maxLetter; i++){
        char newChar = (char) ('a' + i);
        help(k-1, maxLetter, word+newChar, toReturn);
        //help(k-1, maxLetter, word, toReturn) NO BECAUSE YOU CAN'T HAVE A WORD THAT IS NOT K LENGTH
      }
    }
  }
}
