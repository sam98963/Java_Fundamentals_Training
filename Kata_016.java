public class Kata_016 {
  
  public static String toAlternativeString(String string) {
    StringBuilder result = new StringBuilder();
    for(int i = 0; i<string.length(); i++){
      int charCode = (int) string.charAt(i);
      System.out.println(charCode);
      if(charCode >= 65 && charCode <= 90){
        charCode = charCode + 32;
        result.append((char) charCode);
      } else if(charCode >= 97 && charCode <= 122){
        charCode = charCode - 32;
        result.append((char) charCode);
      } else {
        result.append((char) charCode);
      }
    }
  return result.toString();
  }
}