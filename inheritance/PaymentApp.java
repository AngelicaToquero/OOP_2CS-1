public class PaymentApp {
   public static void main(String[] args) {


       Order gcash = new Order("keyboard", 300.0, 10 , new Gcash());
       System.out.println("Order item is " + gcash.getItem());
       System.out.println("Unit price is " + gcash.getUnitPrice() );
       System.out.println("Quantity is " + gcash.getQuantity());


       //Order gcash = new Order();
       System.out.println();
       System.out.println("Payment order details if " + gcash.getPaymentmode().getClass().getSimpleName());
       System.out.println("Discount rate is " + gcash.getPaymentmode().determineDiscountRate());
       System.out.println("Payment amount is " + gcash.getTotalAmount());


       Order maya = new Order();
       maya.setItem("keyboard");
       maya.setUnitPrice(300.0);
       maya.setQuantity(10);
       maya.setPaymentmode(new Maya());


       System.out.println();
       System.out.println("Payment order details if "+ maya.getPaymentmode().getClass().getSimpleName());
       System.out.println("Discount rate is " + maya.getPaymentmode().determineDiscountRate());
       System.out.println("Payment amount is " + maya.getTotalAmount());


       System.out.println();
       Order shopeepay = new Order("keyboard", 300.0, 10 , new ShopeePay());
       System.out.println("Payment order details if " + shopeepay.getPaymentmode().getClass().getSimpleName());
       System.out.println("Discount rate is " + shopeepay.getPaymentmode().determineDiscountRate());
       System.out.println("Payment amount is " + shopeepay.getTotalAmount());

   }
}
