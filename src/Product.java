import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Product {
    private String name;

    private List<Component> components = new ArrayList<>();


    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addComponent(Component component) {
        this.components.add(component);
    }


    public void removeComponent(Component component) {
        Component temporaryComponent = null;
        for (Component component1 : this.components) {
            if (component1.getName().equals(component.getName())) {
                temporaryComponent = component1;
                break;
            }
        }
        if (temporaryComponent != null) {
            components.remove(temporaryComponent);
        }
    }
    public double getPrice(){
        double result = 0;
        for(Component component1 : components ){
            result +=component1.getPrice();
        }
        return result;
    }

    @Override
    public String toString() {
        return "It is " + name + " with components " + Arrays.toString(components.toArray());
    }
}
