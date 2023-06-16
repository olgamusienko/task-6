import java.util.List;

public class OnlineWaiter extends Order{

    private static Integer orderId = 1000;


    @Override
    public Integer makeOrder(List<Product> products) {
        int currentOrder = orderId;
        orders.put(orderId++,products);
        return currentOrder;


    }
}