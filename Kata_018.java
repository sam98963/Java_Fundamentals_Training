public class Kata_018 {

  public static int signChange(int[] arr) {
    if(arr.length == 0){
      return 0;
    }
    int count = 0;
    boolean positive = true;
    if(arr[0] < 0){
      positive = false;
    }
    for(int i = 0; i<arr.length; i++){
      if(arr[i] >= 0 && !positive){
        count++;
        positive = true;
      } else if(arr[i] < 0 && positive){
        count ++;
        positive = false;
      }
    }
    return count;
  }

}