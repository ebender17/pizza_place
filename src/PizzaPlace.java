import java.util.ArrayList;

public class PizzaPlace {
    String name;
    String phone;
    ArrayList<Crust> crusts;
    ArrayList<Size> sizes;
    ArrayList<Ingredient> ingredients;
    ArrayList<Order> orders;
    private static PizzaPlace instance;






    public PizzaPlace(String name, String phone) {
        this.name = name;
        this.phone = phone;
        this.orders = new ArrayList<Order>();

        //Sizes
        this.sizes = new ArrayList<Size>();
        this.sizes.add(new Size("Small", 6, 8));
        this.sizes.add(new Size("Medium", 10, 12));
        this.sizes.add(new Size("Large", 12, 16));
        this.sizes.add(new Size("Super", 16, 20));

        //Crusts
        this.crusts = new ArrayList<Crust>();
        this.crusts.add(new Crust("Thin", 0));
        this.crusts.add(new Crust("Regular", 0));
        this.crusts.add(new Crust("Deep-dish", 0));

        //Ingredients
        this.ingredients = new ArrayList<Ingredient>();
        this.ingredients.add(new Ingredient("Cheese", 1));
        this.ingredients.add(new Ingredient("Mushrooms", 1));
        this.ingredients.add(new Ingredient("Chicken", 1));
        this.ingredients.add(new Ingredient("Pepperoni", 1));
        this.ingredients.add(new Ingredient("Tuna", 1));
    }

    public static PizzaPlace getInstance() {
        if (instance == null) {
            instance = new PizzaPlace("IT2045C", "123-123-1234");
            
        }
        return instance;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void placeOrder(Order order) {
        this.orders.add(order);
    }

    public void addSize(Size size) {
        this.sizes.add(size);
    }

    public void addCrust(Crust crust) {
        this.crusts.add(crust);
    }

    public void addIngredient (Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }

    public ArrayList<Crust> getCrusts() {
        return crusts;
    }

    public ArrayList<Size> getSizes() {
        return sizes;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }
}
