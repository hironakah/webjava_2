import java.util.Random;

abstract class Document {
  
  // メンバ変数
  protected int DocNum;
  protected String DocName;
  
  Document(int DocNum) { //  コンストラクタ
    /*
     *  ドキュメントの番号付与
     */
    
    Random random = new Random();
    this.DocNum = random.nextInt(999998) + DocNum;
    
  }
  
  public void setDocName(String DocName) {
    this.DocName = DocName;
  }
  
  public String getDocName() {
    String getName = "書類名：" + DocName;
    return getName;
  }
  
  abstract void newDocMake();   //  抽象メソッド(サブクラスで実装の必要あり)
}
