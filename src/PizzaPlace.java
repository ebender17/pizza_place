import java.util.ArrayList;

public class PizzaPlace {
    String name;
    String phone;
    ArrayList<Crust> crusts;
    ArrayList<Size> sizes;
    ArrayList<Ingredient> ingredients;
    ArrayList<Order> orders;
    private static PizzaPlace instance;




    private ArrayList<Subscriber> subscribers;
    ArrayList<String> names;


    public PizzaPlace(String name, String phone) {
        this.name = name;
        this.phone = phone;
        this.orders = new ArrayList<Order>();
        names = new ArrayList<>();
        subscribers = new ArrayList<>();

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

    public static PizzaPlace getInstance(String title, String phone) {
        if (instance == null) {
            instance = new PizzaPlace(title, phone);

        }
        return instance;
    }

    public void addSubscriber(Subscriber s) {
        subscribers.add(s);
    }

    public void unsubscribe (Subscriber s) {
        subscribers.remove(s);
    }

    public void notifySubscribers() {
        for (Subscriber s:subscribers
             ) {
            s.update();
        }
    }

    public ArrayList<String> getNames() {
        return names;
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
        notifySubscribers();
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
