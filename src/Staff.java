
class Staff extends Employee{
  
  Staff(String Position, String EmpNum) {
    super(Position, EmpNum);    //  継承されないコンストラクタ呼び出し
  }
  
  void work(){
    startWork();
    PaySlip paySlip = new PaySlip(1); //  インスタンス化(引数1)
    System.out.println("書類番号：" + paySlip.DocNum);
    paySlip.newDocMake();
  }
}
