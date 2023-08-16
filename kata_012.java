public class kata_012
{
  public static String replaceNth(String text, int n, char oldValue, char newValue)
  {
    int occurences = 0;
    char arr[] = text.toCharArray();
    for(int i = 0; i<text.length(); i++){
      if(text.charAt(i) == oldValue){
        occurences++;
        if(occurences == n){
        arr[i] = newValue;
        occurences = 0;
        }
      } else {
        arr[i] = text.charAt(i);
      }
    }
     return new String(arr);
  }
}