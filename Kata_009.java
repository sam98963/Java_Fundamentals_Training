public class Kata_009 {

  public int factorial(int n) {
    int result = n;
    if(n<0 || n>12){
      throw new IllegalArgumentException("Input out of range.");
    } else{
      for(int i = (n-1); i>0; i--){
        result *= i;
      }
    }
    if(n==0){
      result = 1;
    }
    return result;
  }
}