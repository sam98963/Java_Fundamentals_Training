public class Kata_029 {

  public static boolean validatePin(String pin) {
    String regex = "[0-9]+";
    if((pin.length() == 4 || pin.length() == 6) && pin.matches(regex)){
      return true;
    } 
    return false;
  }
}