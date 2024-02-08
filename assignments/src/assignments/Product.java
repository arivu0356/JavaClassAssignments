package assignments;

public class Product {
    private double price;

    public Product(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Product product = new Product(10.50);
        System.out.println("Price for 1 quantity: $" + product.getPrice());
        System.out.println("Price for 5 quantities: $" + product.getPrice(5));
    }
}
