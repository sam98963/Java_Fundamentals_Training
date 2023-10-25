public class Kata_023 {
    public static String createPhoneNumber(int[] numbers) {
      StringBuilder str = new StringBuilder();
      str.append("(");
      for (int i = 0; i<numbers.length; i++){
        if(i == 3){
          str.append(") ");
        } if(i == 6){
          str.append("-");
        }
          str.append(numbers[i]);
      }
      return str.toString();
    }
}
