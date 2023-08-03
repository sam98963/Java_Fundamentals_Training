import java.util.ArrayList;
public class Kata_010 {
  
  public static Object[] removeEveryOther(Object[] arr) {
    ArrayList<Object> answer = new ArrayList<>();
    for(int i = 0; i<arr.length; i++){
      if(i % 2 == 0){
        answer.add(arr[i]);
      }
    }
    return answer.toArray();
  }
}