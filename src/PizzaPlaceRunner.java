public class PizzaPlaceRunner {
    public static void main(String[] args) {
        PizzaPlace repo = PizzaPlace.getInstance("IT2045C", "123-123-1234");
        PizzaGUI app = new PizzaGUI(repo.getName(),
                repo.getCrusts(),
                repo.getSizes(),
                repo.getIngredients());
        KitchenView kitchenView = new KitchenView("IT2045C Kitchen View");
        repo.addSubscriber(kitchenView);


    }
}
