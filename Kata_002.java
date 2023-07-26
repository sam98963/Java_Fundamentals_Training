package Java_Fundamentals_Training;

public class Kata_002 {
  public static int noBoringZeros(int n) {
  String numString = Integer.toString(n);
  String[] numArray = numString.split(""); 
      for(int i = numArray.length-1; i>=0; i--){
        if(numArray[i].equals("0")){
          numArray[i]="";
          System.out.print(numArray[i]);
        } else {
          break;
        }
      }
      String finalNumString = String.join("", numArray);
    if(finalNumString.isEmpty()){
      return 0;
    }
      return Integer.parseInt(finalNumString);
  }
}