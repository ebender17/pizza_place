import java.util.ArrayList;

public class Order {
    ArrayList<Pizza> pizzas;

    public Order() {
        this.pizzas = new ArrayList<Pizza>();
    }

    public void addPizza(Pizza pizza) {
        this.pizzas.add(pizza);
    }

    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }

    public String getRecipt() {
        return "";
    }

    public double getTotal() {
        return 0;
    }
}
