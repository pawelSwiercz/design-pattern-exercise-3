package pizza;

import java.util.List;

public class ItalianPizza extends Pizza {

    private double cost;
    private List<String> components;
    PizzaType pizza;


    public ItalianPizza(double cost, List<String> components) {
        super(cost, components, PizzaType.ITALIAN);
    }

    @Override
    public String toString() {
        return PizzaType.ITALIAN + " pizza {" +
                "cost= " + cost +
                ", components= " + components +
                '}';
    }
}
