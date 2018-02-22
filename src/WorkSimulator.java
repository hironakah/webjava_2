import java.util.Scanner;

public class WorkSimulator {

  public static void main(String[] args) {
    
    System.out.println("社員番号を入力してください。");
    System.out.println("eを入力すると終了します。");
    Scanner ScanPass = new Scanner(System.in);
    String EmpNum = ScanPass.next();
    
    if(EmpNum.equals("e")) {   //    入力値がeの場合終了
      return;
      
    }else {   //  入力がeでない場合
      boolean Num = EmpNum.matches("[0-9]{6}");   //  6桁の数字であるか判定
      
      if(Num == true) {     //  6桁の数字の場合
        boolean CEONum = EmpNum.matches("000000");
        
        if(CEONum ==true) {
          CEO ceo = new CEO("社長が");
          ceo.work();
          
        }else {
          /*
           *    EmpNumを分割(split)し、switchでケースを記載
           *    一桁目が
           *        0なら役職者
           *            NewManager manager = new NewManager("役職者が",EmpNum);
           *            manager.work();
           *        1-4ならプロパ
           */
          Staff staff = new Staff("プロパの",EmpNum);
          staff.work();
          /*
           *        5-9ならBP
           *            NewBP bp = new NewBP("BPが",EmpNum);
           *        それ以外は
           *            break;
           */
        }
        
      }else {   //  6桁の数字でない場合
        System.out.println("入力エラーです。");
        System.out.println("再度入力してください。" + "\r\n");
        main(args);   //  入力エラーの場合、メソッドを呼びなおす
        return;     //  呼びなおした際にif判定処理を終了する
        
      }
    }
  }

}
