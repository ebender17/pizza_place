public class Crust implements Chargable {
    String name;
    double price;

    public Crust(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String toString() {
        return this.getName() + " - " + this.getPrice();

    }
}
