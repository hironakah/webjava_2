
class CEO extends Employee{
  
  CEO(String Position) {
    super(Position, null);    //  継承されないコンストラクタ呼び出し
  }
  
  @Override
  void startWork(){
    System.out.println(Position + "契約した内容を表示します。");
  }
  
  void work(){
    startWork();
    Contract contract = new Contract(1);  //  インスタンス化(引数1)
    System.out.println("書類番号：" + contract.DocNum);
    contract.newDocMake();
  }
  
}
