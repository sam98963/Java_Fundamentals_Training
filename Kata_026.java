import java.util.ArrayList;
public class Kata_026
{
  public static long[] NumbersWithDigitInside(long x, long d)
  {
    long count = 0;
    long sum = 0;
    long product = 1;
    ArrayList<Integer> arr = new ArrayList<>();
    for(int i = 1; i <= x; i++){
      if(String.valueOf(i).contains(String.valueOf(d))){
        arr.add(i);
        count++;
        sum += i;
        product *= i;
      }
    }
    long[] result = {count, sum, (count > 0) ? product : 0};
    return result;
  }
}