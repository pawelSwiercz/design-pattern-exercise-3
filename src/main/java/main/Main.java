package main;

import pizza.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CapriciosaPizza capriciosaPizza = new CapriciosaPizza(31.99,Arrays.asList("cheese","champignons","ham"));
        HawaiPizza hawaiPizza = new HawaiPizza(29.99,Arrays.asList("cheese","pineaple","ham"));
        MargheritaPizza margheritaPizza = new MargheritaPizza(24, Arrays.asList("cheese"));
        ItalianPizza italianPizza = new ItalianPizza(24, Arrays.asList("mozarella", "tomatoes", "basil"));

        capriciosaPizza.showPizzaInfo();
        hawaiPizza.showPizzaInfo();
        margheritaPizza.showPizzaInfo();
        italianPizza.showPizzaInfo();
    }

}
