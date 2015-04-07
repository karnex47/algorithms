public class Property {
  public double calculateTaxes(Double taxRate) {
    Double tax = 0;
    tax = this.marketValue*taxRate/100;
    if(this.marketValue > 250000) {
      tax += (this.marketValue*1.5)/100;
    }
  }
}