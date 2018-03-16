
class Contract extends DocumentBase{
  
  Contract(int DocNum) {
    super(DocNum);
  }

  void make(String docName) {
    System.out.println("書類番号:" + docNum);
    System.out.println("書類名:" + docName);
    System.out.println("契約者:" + docEmpName);
    System.out.println("契約会社:" + docClientName);
    System.out.println("契約金:" + docWorkCost + "万円");
  }

}
