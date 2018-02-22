
abstract class Employee {
  
  //    メンバ変数
  protected String Position;
  protected String EmpNum;
  
  Employee(String Position, String EmpNum) {   //  コンストラクタ
    this.Position = Position;
    this.EmpNum = EmpNum;
  }
  
  void startWork() {
    System.out.println("社員番号：" + EmpNum);
    System.out.println(Position + "給与明細を表示します。");
  }
  
  abstract void work(); //  抽象メソッド(サブクラスで実装の必要あり)
  
}
