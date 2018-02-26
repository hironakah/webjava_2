import java.util.Scanner;

public class WorkSimulator {

  public static void main(String[] args) {
    
    System.out.println("従業員を選択");
    
    Scanner empSelect = new Scanner(System.in);
    int empName = empSelect.nextInt();
    
    //  選択された従業員の給与をセット
    NewStaff newStaff = new NewStaff();
    newStaff.setEmpCost();
    
    //  Staff staff = new Staff();
    //  staff.setEmpCost();
    
    System.out.println("顧客を選択");
    
    Scanner clientSelect = new Scanner(System.in);
    int clientName = clientSelect.nextInt();
    
    //  選択された顧客の契約金をセット
    RoyalCustomer client = new RoyalCustomer();
    client.setWorkCost();
    
    //  ドキュメント作成
    Document doc = new Document(1);
    doc.docName = "契約書";
    doc.docEmpName = newStaff.Position;
    doc.docWorkCost = client.getWorkCost();
    doc.docClientName = client.clientName;
    doc.docMake();
    
    
    
    
  }

}
