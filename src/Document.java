import java.util.Random;

class Document {
  
  // メンバ変数
  protected int docNum;
  protected String docName;
  protected String docEmpName;
  protected String docClientName;
  protected int docWorkCost;
  
  Document(int DocNum) {
    Random random = new Random();
    this.docNum = random.nextInt(999998) + DocNum;
  }
  
  void docMake() {
    System.out.println("書類番号:" + docNum);
    System.out.println("書類名:" + docName);
    System.out.println("契約者:" + docEmpName);
    System.out.println("契約会社:" + docClientName);
    System.out.println("契約金:" + docWorkCost + "万円");
  }
  
}
