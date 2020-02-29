package pizza;

import java.util.Arrays;
import java.util.List;

public class CapriciosaPizza extends Pizza {

    public CapriciosaPizza(double cost, List<String> components) {
        super(cost, components, PizzaType.CAPRICIOSA);
    }

    @Override
    public String toString() {
        return PizzaType.CAPRICIOSA + " pizza {" +
                "cost= " + cost +
                ", components= " + components +
                '}';
    }


}
