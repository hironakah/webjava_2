
/*
 * 修正予定
 * 金額を変数に格納予定
 * 他クラスから参照可能
 */


class RoyalCustomer {
  
  private Client spec = Client.SPEC;
  private Client dev = Client.DEV;
  private Client test = Client.TEST;
  
  void makeContract() {
    System.out.println(spec.getStep() + "：\\450,000 / 人");
    System.out.println(dev.getStep() + "：\\550,000 / 人");
    System.out.println(test.getStep() + "：\\400,000 / 人");
    
  }

}
