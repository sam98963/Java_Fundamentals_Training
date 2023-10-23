import java.util.ArrayList;

class Kata_019 {

  public static int countPassengers(ArrayList<int[]> stops) {
    int count = 0;
    for(int i = 0; i<stops.size(); i++){
      count += stops.get(i)[0];
      count -= stops.get(i)[1];
    }
    if(count < 0){
      return 0;
    } else {
      return count;
    }
  }
}