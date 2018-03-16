
class PaySlip extends DocumentBase{
  
  PaySlip(int DocNum) {
    super(DocNum);
  }
  
  void make(String docName) {
    System.out.println("書類番号:" + docNum);
    System.out.println("書類名:" + docName);
    System.out.println("職種:" + docEmpName);
    System.out.println("給与:" + docEmpSalary + "万円");
  }
}
