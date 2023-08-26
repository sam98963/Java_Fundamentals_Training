public class Kata_013 {
	
	public static int billboard(String name, int price) {
    int sum = 0;
    for(int i = 0; i < name.length(); i++){
      sum += price;
    }
    return sum;
  }
}