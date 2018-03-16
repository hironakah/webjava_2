import java.util.Random;

abstract class DocumentBase {
  
  // メンバ変数
  protected int docNum;
  protected String docName;
  protected String docEmpName;
  protected String docClientName;
  protected double docWorkCost;
  protected double docEmpSalary;
  
  DocumentBase(int DocNum) {
    Random random = new Random();
    this.docNum = random.nextInt(999998) + DocNum;
  }
  
  abstract void make(String DocName);
  

}
