public class Kata_003 {

  public static int dutyFree(int normPrice, int discount, int hol) {
    double saving = Math.floor(hol / (normPrice * (discount / 100.0)));
    System.out.print(saving);
    return (int) saving;
    
  }

}