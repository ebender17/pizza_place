import java.util.ArrayList;

public class PizzaPlace {
    String name;
    String phone;
    ArrayList<Crust> crusts;
    ArrayList<Size> sizes;
    ArrayList<Ingredient> ingredients;
    ArrayList<Order> orders;





    public PizzaPlace(String name, String phone) {
        this.name = name;
        this.phone = phone;
        this.orders = new ArrayList<Order>();
        
        this.sizes = new ArrayList<Size>();
        this.crusts = new ArrayList<Crust>();
        this.ingredients = new ArrayList<Ingredient>();

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
}
