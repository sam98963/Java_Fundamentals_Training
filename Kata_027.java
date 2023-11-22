import java.lang.StringBuilder;
public class Kata_027{
  public static String gimmeTheLetters(String s){
    StringBuilder string = new StringBuilder();
    int firstCharCode = (int)s.charAt(0);
    int lastCharCode = (int)s.charAt(2);
    for(int i = firstCharCode; i <= lastCharCode; i++){
      string.append((char)i);
    }
    return string.toString();
  }
}