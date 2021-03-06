package pizza;

import java.util.Arrays;
import java.util.List;

public class MargheritaPizza extends Pizza {

    private double cost;
    private List<String> components;
    PizzaType pizza;


    public MargheritaPizza(double cost, List<String> components) {
        super(cost, components, PizzaType.MARGHERITA);
    }

    @Override
    public String toString() {
        return PizzaType.MARGHERITA + " pizza {" +
                "cost= " + cost +
                ", components= " + components +
                '}';
    }
}
