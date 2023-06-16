import java.util.List;

public interface iOrder {
    Menu getMenu();
    Integer makeOrder(List<Product> products);
    double getBill(int orderId);
    String orderDescription(int orderId);

}
