import java.util.List;

//Create classes: Meat, Cheese, Sauce, Bun, which have string field name = name of class and double field price and method toString() with simple description. All these classes are components of products.
//    Create classes: Hamburger, DoubleCheeseBurger,  CheeseBurger - they are products which have: string field name = name of class and List<Components> components - product components (meat, cheese, sauce) and methods: toString() - with simple description, addComponent(component) - to add component, removeComponent(component) - to remove component, getPrice() - return cost of a product which consist of price of all components.
//    Create class Menu which contains methods: getCheeseBurger() - return CheeseBurger object with some default components like: bun, meat, cheese, sauce, getDoubleCheeseBurger() - return DoubleCheeseBurger getHamburger() - return Hamburger;
//    Create classes: OnlineWaiter and Waiter with same methods: getMenu() - return menu, makeOrder(List<Product> products) - receive order from customer and return orderId, getBill(int orderId) - return bill for orderId, orderDescription(int orderId) - return string with order description; Also these classes contains static Integer orderId field (for Waiter starts from 0, from OnlineWaiter starts from 1000) and Map<Integer, List<Product>> orders - which will contain all orders.
//    Create Main class to test this app.
//    Note:
//    1. use inheritance and/or interfaces where it's possible.
//    2. pay attention for NPEs and other exceptions when you will work with orders.
public class Restaurant {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        OnlineWaiter onlineWaiter = new OnlineWaiter();
        Menu menu = waiter.getMenu();
        Product cheeseBurger = menu.getCheeseBurger();
        Product hamBurger = menu.getHamBurger();
        Product doubleCheeseBurger = menu.getDoubleCheeseBurger();

        cheeseBurger.addComponent(new Meat("Meat", 5.99));
        cheeseBurger.addComponent(new Cheese("Gouda", 1.09));
        cheeseBurger.addComponent(new Sauce("Cesar",0.55));
        cheeseBurger.addComponent(new Bun("Sesame", 0.99));
        System.out.println(cheeseBurger.getPrice());
        System.out.println(cheeseBurger);

        hamBurger.addComponent(new Meat("Ham", 7.59));
        hamBurger.addComponent(new Cheese("Melted cheese", 2.59));
        hamBurger.addComponent(new Sauce("Barbecue", 1.59));
        hamBurger.addComponent(new Bun("Bread", 0.25));
        System.out.println(hamBurger.getPrice());
        System.out.println(hamBurger);

        doubleCheeseBurger.addComponent(new Meat("Chicken", 4.99));
        doubleCheeseBurger.addComponent(new Cheese("Gouda", 1.09));
        doubleCheeseBurger.addComponent(new Cheese("Parmesan", 1.59));
        doubleCheeseBurger.addComponent(new Sauce("Tartar",0.62));
        doubleCheeseBurger.addComponent(new Bun("Wholegrain", 0.9));
        System.out.println(doubleCheeseBurger.getPrice());
        System.out.println(doubleCheeseBurger);


        int orderId = waiter.makeOrder(List.of(cheeseBurger, hamBurger, hamBurger));
        System.out.println("Offline order with price: " + waiter.getBill(orderId));
        System.out.println("Offline order with orderId " + orderId + " consists of: " + waiter.orderDescription(orderId));

//        System.out.println(waiter.getBill(10000000));
//        System.out.println(waiter.orderDescription(2000));

        int onlineOrderId = onlineWaiter.makeOrder(List.of(cheeseBurger, doubleCheeseBurger,doubleCheeseBurger));
        System.out.println("Online order with price: " + onlineWaiter.getBill(onlineOrderId));
        System.out.println("Online order with orderId " + onlineOrderId + " consists of: " + onlineWaiter.orderDescription(onlineOrderId));

        System.out.println(waiter.getBill(10000000));
        System.out.println(waiter.orderDescription(2000));




    }
}
