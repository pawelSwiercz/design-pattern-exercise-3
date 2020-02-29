package pizza;

import java.util.List;

public abstract class Pizza {
    public double cost;
    public List<String> components;
    public PizzaType pizzaType;

    public Pizza(double cost, List<String> components, PizzaType pizzaType) {
        this.cost = cost;
        this.components = components;
        this.pizzaType = pizzaType;

    }

    public void showPizzaInfo() {
        System.out.println(this.toString());
    }
}
