import java.util.ArrayList;
public class Kata_024 {

  public static int[] arrayDiff(int[] a, int[] b) {
    ArrayList<Integer> result = new ArrayList<>();
      for(int i = 0; i<a.length; i++){
        if(!contains(b, a[i])){
          result.add(a[i]);
        }
      }
    int[] resultArray = new int[result.size()];
    for(int j = 0; j<result.size(); j++){
      resultArray[j] = result.get(j);
    }
    return resultArray;
  }
  
  public static boolean contains(int[] array, int element) {
    for (int i : array) {
      if (i == element) {
        return true;
      }
    }
    return false;
  }
}
