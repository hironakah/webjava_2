
//  顧客の契約内容 列挙型

public enum Client {
  
  SPEC("仕様") {
    @Override
    Client setStep(String step) {
      return null;
    }
  },
  
  DEV("開発") {
    @Override
    Client setStep(String step) {
      return null;
    }
  },
  
  TEST("評価") {
    @Override
    Client setStep(String step) {
      return null;
    }
  };
  
  private final String step;
  
  private Client(final String step){
    this.step = step;
  }
  
  public String getStep() {
    return step;
  }
  
  abstract Client setStep(final String step);
}
