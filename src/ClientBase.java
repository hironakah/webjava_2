abstract class ClientBase {
  
  //    メンバ変数
  protected String clientName;  //  顧客名
  protected int workCost;    //  仕事量
  protected double workPeriod;  //  仕事期間
  protected String workType;    //  仕事内容
  
  
  //    コンストラクタ
  ClientBase(String Client) {
    clientName = Client;
  }
  
  abstract void setWorkCost();
  abstract int getWorkCost();
  abstract void setWorkPeriod();
  abstract double getWorkPeriod();
  abstract void setWorkType();
  abstract String getWorkType();
  
  
}
