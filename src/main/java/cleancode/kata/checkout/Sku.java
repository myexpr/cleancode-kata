package cleancode.kata.checkout;

public enum Sku {

  A(50), B(30);

  Sku(int unitPrice) {
    this.unitPrice = unitPrice;
  }

  private int unitPrice;

  public final int unitPrice() {
    return unitPrice;
  }
}
