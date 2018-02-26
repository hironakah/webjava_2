class RoyalCustomer extends ClientBase{
  
  RoyalCustomer(){
    super("グーカンパニー");
  }
  
  void setWorkCost() {
    workCost = 50;
  }
  
  public int getWorkCost() {
    return workCost;
  }
  
  void setWorkPeriod() {
    workPeriod = 9;
  }

  double getWorkPeriod() {
    return workPeriod;
  }

  void setWorkType() {
    workType = "仕様";
  }

  String getWorkType() {
    return null;
  }
  
}
