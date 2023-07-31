public class Kata_007 {
  public static float mpgToKPM(final float mpg) {
  float kpg = mpg * 1.609344f;
  float kpl = kpg / 4.54609188f;
  float roundedValue = Math.round(kpl * 100.0f) / 100.0f;
  return roundedValue;
  }
}
