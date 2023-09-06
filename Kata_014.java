public class Kata_014 {
  public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
    int difference = 0;
    int firstVolume = firstCuboid[0]*firstCuboid[1]*firstCuboid[2];
    int secondVolume = secondCuboid[0]*secondCuboid[1]*secondCuboid[2];
      if(firstVolume > secondVolume){
        difference = firstVolume - secondVolume;
      } else if (secondVolume > firstVolume){
        difference = secondVolume - firstVolume;
      }
    return difference;
  }
}