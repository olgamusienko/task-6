import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Order implements iOrder{
    protected Map<Integer, List<Product>> orders = new HashMap<>();

    @Override
    public Menu getMenu() {
        return new Menu();
    }

    @Override
    public double getBill(int orderId) {
        if(orders.containsKey(orderId)) {
            return countOrder(orderId);
        }
        throw new UnknownError("The order does not exist");
    }

    private double countOrder(int orderId) {
        double sum = 0;
        for (Product product : orders.get(orderId)) {
            sum += product.getPrice();
        }
        return sum;
    }

    @Override
    public String orderDescription(int orderId) {
        if(orders.containsKey(orderId)) {
            return printOrder(orders.get(orderId));
        }
        throw new UnknownError("The order does not exist");
    }

    private String printOrder(List<Product> products) {
        return Arrays.toString(products.toArray());
    }
}
