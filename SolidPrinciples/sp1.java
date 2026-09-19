package SolidPrinciples;
// Add drone delivery as a shipping option.
// 02
// Add a crypto payment method.
// 03
// Swap MySQL for Postgres, and email for SMS.
// //


interface ShippingStrategy{
    double shippingCost(Order order);
}

class StandardShipping implements ShippingStrategy{
    public double shippingCost(Order o){
        return o.weight()*1.5;
    }
};

class ExpressShipping implements ShippingStrategy{
    public double shippingCost(Order o){
        return o.weight()*3.0+50;
    }
};

class DroneShipping implements ShippingStrategy{
    public double shippingCost(Order o){
        return o.weight()*4.0+100;
    }

};

interface PaymentStrategy{
    void pay(double amount);
}

//card payment
class StripeClient{
    void charge(double amount){
        System.out.println("Stripe charged:"+amount);
    }
}
class CardPayment implements PaymentStrategy{
    public void pay(double amount){
        StripeClient client=new StripeClient();
        client.charge(amount);
    }
}

//Upi Payment
class RazorpayClient{
    void charge(double amount){
        System.out.println("Razorpay:"+amount);
    }
}
class UpiPayment implements PaymentStrategy{
    public void pay(double amount){
        RazorpayClient client=new RazorpayClient();
        client.charge(amount);

    }
}

//Crypto payment
class CryptoClient{
    public void charge(double amount){
        System.out.println("CryptoClient"+amount);
    }
}
class CryptoPayment implements PaymentStrategy{
    public void pay(double amount){
        CryptoClient client=new CryptoClient();
        client.charge(amount);
    }
}

//Wallet payment
class WalletClient{
    public void charge(double amount){
        System.out.println("WalletClient"+amount);
    }
}
class WalletPayment implements PaymentStrategy{
    public void pay(double amount){
        WalletClient client=new WalletClient();
        client.charge(amount);
    }
}

class Order{
    private final String id;
    private final double weight;
    private final double subtotal;
    private final String customerContact;

    Order(String id,double weight,double subtotal,String customerContact){
        this.id=id;
        this.weight=weight;
        this.subtotal=subtotal;
        this.customerContact=customerContact;
    }

    //getter
    public String id(){
        return id;
    }
    public double weight(){
        return weight; 
    }
    public double subtotal(){
        return subtotal;
    }
    public String customercontact(){
        return customerContact;
    }

}


class OrderProcessor {

        private final ShippingStrategy shippingStrategy;
        private final PaymentStrategy paymentStrategy;

        OrderProcessor(ShippingStrategy shippingStrategy, PaymentStrategy paymentStrategy){
            this.shippingStrategy=shippingStrategy;
            this.paymentStrategy=paymentStrategy;

        }
        double process(Order order){
            double shipping=shippingStrategy.shippingCost(order);
            double total=order.subtotal()+shipping;

            paymentStrategy.pay(total);
            return total;
        }
}

