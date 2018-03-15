class GuCompany extends ClientBase{
  
  GuCompany(){
    super("グーカンパニー");
  }
  
  void setWorkCost() {
    workCost = 50;  //  仕事量
  }
  
  public double getWorkCost() {
    return workCost;
  }
  
  void setWorkPeriod() {
    workPeriod = 60;    //  仕事期間
  }

  double getWorkPeriod() {
    return workPeriod;
  }

  void setWorkType() {
    workType = "評価";    //  仕事内容
  }

  String getWorkType() {
    return workType;
  }
  
}
