
abstract class EmployeeBase {
  
  //    メンバ変数
  protected String Position;    //  職種
  protected int empSalary;   //  給与
  protected double empCost; //  人月
  
  //    コンストラクタ
  EmployeeBase(String Position){
    this.Position = Position;
  }
  
  abstract void setEmpSalary();
  abstract int getEmpSalary();
  abstract void setEmpCost();
  abstract double getEmpCost();
}
