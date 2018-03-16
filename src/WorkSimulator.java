public class WorkSimulator {

  public static void main(String[] args) {
    
    EmployeeBase emp = null;
    ClientBase cli = null;
    DocumentBase doc = null;
    WorkBase workType = null;
    
    Select sel = new Select();
    //  従業員選択
    emp = sel.employeeSelect(emp);
    //  顧客選択
    cli = sel.clientSelect(cli);
    
    //  ドキュメント作成
    doc = new Contract(1);
    doc.docEmpName = emp.position;
    doc.docWorkCost = cli.getWorkCost();
    doc.docClientName = cli.clientName;
    doc.make("契約書");
    
    int con = sel.contractSlect();
    
    if(con < 1) {
      //    仕事内容選択
      String wt = cli.getWorkType();
      workType = sel.workTypeSelect(workType, wt);
      
      double ec = emp.getEmpCost();
      double wc = cli.getWorkCost();
      
      workType.setWorkDay(ec, wc);
      
      doc = new PaySlip(1);
      doc.docEmpName = emp.position;
      
      if(workType.getWorkDay() > cli.getWorkPeriod()) {
        System.out.println("期限超過により減給");
        doc.docEmpSalary = (emp.getEmpSalary() * 0.8);
        
      }else {
        doc.docEmpSalary = emp.getEmpSalary();
      }
      
      doc.make("給与明細");
    }else {
      
    }
    
  }
  
}
