package pizza;

import java.util.List;

public class PizzaFactory {
    public Pizza createPizza(double cost, List<String> components, PizzaType pizzatype) {
        switch (pizzatype) {
            case CAPRICIOSA:
                return new CapriciosaPizza(cost, components);
            case ITALIAN:
                return new ItalianPizza(cost, components);
            case HAWAI:
                return new HawaiPizza(cost, components);
            case MARGHERITA:
                return new MargheritaPizza(cost, components);

            default: {
                throw new IllegalArgumentException("Unknown pizza type");
            }
        }
    }
}
