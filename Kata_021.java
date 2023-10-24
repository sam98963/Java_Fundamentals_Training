import java.util.Arrays;
public class Kata_021 {
  public static boolean isAnagram(String test, String original) {
    String testSorted = test.replaceAll("\\s", "").toLowerCase();
    char testCharArray[] = testSorted.toCharArray();
  
    String originalSorted = original.replaceAll("\\s", "").toLowerCase();
    char originalCharArray[] = originalSorted.toCharArray();

    if(testSorted.length() != originalSorted.length()){
      return false;
    }
    
    Arrays.sort(testCharArray);
    Arrays.sort(originalCharArray);

    return Arrays.equals(originalCharArray, testCharArray);
  }
}