 package SolidPrinciples;

public class Client {
    public static void main(String[] args) {
        Order order = new Order("ORD-1", 20, 500, "9999999999");

        OrderProcessor processor = new OrderProcessor(new DroneShipping(), new CryptoPayment());
        double total = processor.process(order);

        System.out.println("Total: " + total);
    }
}
