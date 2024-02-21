public class Order {
   private String item;


   private Integer quantity;


   private Double unitPrice;
   private Double totalAmount;


   public Order(){


   }
   public Order(String item, Double unitPrice,
                Integer quantity, PaymentMode paymentmode) {
       this.item = item;
       this.unitPrice = unitPrice;
       this.quantity = quantity;
       this.paymentmode = paymentmode;
   }


   public PaymentMode getPaymentmode() {
       return paymentmode;
   }


   public void setPaymentmode(PaymentMode paymentmode) {
       this.paymentmode = paymentmode;
   }


   private PaymentMode paymentmode;


   public String getItem() {
       return item;
   }


   public void setItem(String item) {
       this.item = item;
   }


   public Integer getQuantity() {
       return quantity;
   }


   public void setQuantity(Integer quantity) {
       this.quantity = quantity;
   }


   public Double getUnitPrice() {
       return unitPrice;
   }


   public void setUnitPrice(Double unitPrice) {
       this.unitPrice = unitPrice;
   }


   public Double getTotalAmount() {


       return unitPrice*quantity * (1-paymentmode.determineDiscountRate());
   }


   public void setTotalAmount(Double totalAmount) {
       this.totalAmount = totalAmount;
   }

}
