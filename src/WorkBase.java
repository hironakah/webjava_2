import java.util.Random;

abstract class WorkBase {

  int day;
  double rem;
  int i;
  
  abstract int getWorkDay() ;

  void setWorkDay(double EmpCost, double WorkCost) {
    for(i = 0; WorkCost > 0;i++) {
      WorkCost =(WorkCost - EmpCost);
      day++;
      WorkCost = interrupt(WorkCost);
    }
    System.out.println("作業日数：" + day + "日");
    System.out.println("仕事終了");
  }
  
  double interrupt(double rem) {
    Random random = new Random();
    int interrupt = random.nextInt(10);
    if(interrupt < 3) {
      rem = rem + 0.5;
    }
    return rem;
  }
}
