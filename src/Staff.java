
class Staff extends EmployeeBase{
  
  Staff(){
    super("一般職");   //  職種名
  }
  
  public int getEmpSalary() {
    return empSalary;
  }
  
  void setEmpSalary(){
    empSalary = 30;  //  給与額
  }
  
  public double getEmpCost() {
    return empCost;
  }
  
  void setEmpCost() {
    empCost = 1;    //  仕事量(人月)
  }
}
