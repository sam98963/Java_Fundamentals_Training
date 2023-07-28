public class Kata_006 {
  public static String tripleTrouble(String one, String two, String three) {
    String result = "";
    for(int i = 0; i<one.length(); i++){
      String letters = String.valueOf(one.charAt(i)) + two.charAt(i);
             letters = letters + three.charAt(i);
      result = result + letters;
    }
    return result;
  }
}
