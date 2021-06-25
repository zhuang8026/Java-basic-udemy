package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasicDemo {

  public static void main(String[] args) {
    Pattern pat = Pattern.compile("Andrew", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pat.matcher("Andrew Programming!");

    boolean matchFound = matcher.find(); // find reurn boolean
    if (matchFound) {
      System.out.println("Match found");
    } else {
      System.out.println("Match not found");
    }
  }

}
