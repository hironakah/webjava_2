
class PaySlip extends Document{

  PaySlip(int DocNum) {
    super(DocNum); //  継承されないコンストラクタ呼び出し
  }

  void newDocMake(){
    setDocName("給与明細");
    System.out.println(getDocName());
    
    RoyalCustomer newRoyalCustomer = new RoyalCustomer();
    /*
     * RoyalCustomerクラスを修正予定
     * 金額を変数として取得する
     * 仕様/開発/評価のどれか一つの金額の80%を給与とする
     */
    
  }
}
