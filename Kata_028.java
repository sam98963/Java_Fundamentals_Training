public class Kata_028
{
  public static int dontGiveMeFive(int start, int end)
  {
    int count = 2;
    if (String.valueOf(start).contains("5")){
      count--;
    }if (String.valueOf(end).contains("5")){
      count--;
    }
    for(int i = start + 1; i < end; i++){
      if(!String.valueOf(i).contains("5")){
        count++;
      }
    }
    return count;
  }
}