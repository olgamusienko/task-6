import java.util.List;

public class Waiter extends Order{
    private static Integer orderId = 0;


    @Override
    public Integer makeOrder(List<Product> products) {
        int currentOrder = orderId;
        orders.put(orderId++,products);
        return currentOrder;


    }
}
