
class Contract extends Document{
  
  Contract(int DocNum) {
    super(DocNum); //  継承されないコンストラクタ呼び出し
  }

  void newDocMake(){
    setDocName("契約書");
    System.out.println(getDocName());
    
    RoyalCustomer newRoyalCustomer = new RoyalCustomer();
    newRoyalCustomer.makeContract();
  }
  
  
  
  
}
