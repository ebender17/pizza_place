public class PizzaPlaceRunner {
    public static void main(String[] args) {
        PizzaPlace pizzaPlace = new PizzaPlace("IT2045C", "123-123-1234");
        PizzaGUI app = new PizzaGUI(pizzaPlace.getName(),
                pizzaPlace.getCrusts(),
                pizzaPlace.getSizes(),
                pizzaPlace.getIngredients());

    }
}
