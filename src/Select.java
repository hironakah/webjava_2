import java.util.Scanner;

public class Select {
  
  
  EmployeeBase employeeSelect(EmployeeBase emp) {
    System.out.println("従業員を選択");
    System.out.println("[1]新人");
    System.out.println("[2]一般職");
    
    //  従業員入力
    Scanner empSelect = new Scanner(System.in);
    int empType = empSelect.nextInt();
    
    //  選択された従業員の給与、仕事量をセット
    switch(empType) {
      case 1:
        emp = new NewStaff();
        break;
      case 2:
        emp = new Staff();
        break;
      //  emp = new Specialist();
      //  emp = new Expert();
      default:
        break;
    }
    emp.setEmpCost();
    emp.setEmpSalary();
    
    return emp;
  }
  
  ClientBase clientSelect(ClientBase cli) {
    System.out.println("顧客を選択");
    System.out.println("[1]グーカンパニー");
    
    // 顧客入力
    Scanner cliSelect = new Scanner(System.in);
    int cliName = cliSelect.nextInt();
    
    //  選択された顧客の仕事量、期間、内容をセット
    switch(cliName) {
      case 1:
        cli = new GuCompany();
        break;
      default:
        break;
    }
    cli.setWorkCost();
    cli.setWorkPeriod();
    cli.setWorkType();
    
    return cli;
  }
  
  int contractSlect() {
    System.out.println("契約して仕事を実行しますか？");
    System.out.println("yse : 0");
    System.out.println("no  : 1");
    
    Scanner anser = new Scanner(System.in);
    int workAnser = anser.nextInt();
    
    return workAnser;
  }

  WorkBase workTypeSelect(WorkBase workType, String wt) {
    
    switch(wt) {
      case "仕様":
        workType = new SpecWork();
        break;
      case "開発":
        workType = new DevWork();
        break;
      case "評価":
        workType  = new TestWork();
        break;
      default:
        break;
    }
    
    return workType;
  }
  
  
  
}
