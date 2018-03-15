import java.util.Random;

class DevWork extends WorkBase{

  int getWorkDay() {
    return day;
  }
  
  @Override
  double interrupt(double rem) {
    Random random = new Random();
    int interrupt = random.nextInt(10);
    if(interrupt < 5) {
      rem = rem + 0.5;
    }
    return rem;
  }
}