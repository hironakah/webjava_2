import java.util.Random;

class Document {
  
  // メンバ変数
  protected int docNum;
  protected String docName;
  protected String docEmpName;
  protected String docClientName;
  protected double docWorkCost;
  protected double docEmpSalary;
  
  Document(int DocNum) {
    Random random = new Random();
    this.docNum = random.nextInt(999998) + DocNum;
  }
  
  void docMake(int DocType) {
    System.out.println("書類番号:" + docNum);
    switch(DocType) {
      case 1:
        docContract("契約書");
        break;
      case 2:
        docPaySlip("給与明細");
        break;
      default:
        break;
    }
  }
  
  void docContract(String docName) {
    System.out.println("書類名:" + docName);
    System.out.println("契約者:" + docEmpName);
    System.out.println("契約会社:" + docClientName);
    System.out.println("契約金:" + docWorkCost + "万円");
  }
  
  void docPaySlip(String docName) {
    System.out.println("書類名:" + docName);
    System.out.println("職種:" + docEmpName);
    System.out.println("給与:" + docEmpSalary + "万円");
  }
}
