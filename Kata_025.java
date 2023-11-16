class Kata_025 {
  public static String findScreenHeight(int width, String ratio) {
      String[] split = ratio.split(":");
      double height = ((double) Integer.parseInt(split[1]) / Integer.parseInt(split[0])) * width;
      System.out.println(height);
      return Integer.toString(width) + "x" + Integer.toString((int) height);
  }
}