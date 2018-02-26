
class NewStaff extends EmployeeBase{
  
  NewStaff(){
    super("新人");    //  職種名
  }
  
  public int getEmpSalary() {
    return empSalary;
  }
  
  void setEmpSalary(){
    empSalary = 20;  //  給与額
  }
  
  public double getEmpCost() {
    return empCost;
  }
  
  void setEmpCost() {
    empCost = 0.5;    //  仕事量(人月)
  }
}
