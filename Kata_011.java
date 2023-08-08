public class Kata_011 {
  public static String oddOrEven (int[] array) {
    String result = "even";
    int sumOfIntegers = 0;
    for (int i = 0; i<array.length; i++){
      sumOfIntegers = sumOfIntegers + array[i];
    }
    if(sumOfIntegers % 2 != 0){
      result = "odd";
    }
    return result;
  }
}