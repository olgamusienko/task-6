public class Menu {
    public Product getCheeseBurger(){
        return new CheeseBurger("CheeseBurger");
    }
    public Product getHamBurger(){
        return new CheeseBurger("HamBurger");
    }
    public Product getDoubleCheeseBurger(){
        return new CheeseBurger("DoubleCheeseBurger");
    }

}