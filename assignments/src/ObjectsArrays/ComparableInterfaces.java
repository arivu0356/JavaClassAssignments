package ObjectsArrays;

public class ComparableInterfaces implements Comparable<ComparableInterfaces>{
    private double weight;
    private double price;
    private int id;

    public ComparableInterfaces(double weight, double price, int id) {
        this.weight = weight;
        this.price = price;
        this.id = id;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(ComparableInterfaces otherProduct) {
        if (this.price < otherProduct.price) {
            return -1;
        } else if (this.price > otherProduct.price) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", weight=" + weight + ", price=" + price + "]";
    }

    public static void main(String[] args) {
    	ComparableInterfaces product1 = new ComparableInterfaces(2.5, 10.0, 101);
    	ComparableInterfaces product2 = new ComparableInterfaces(1.8, 15.0, 102);
    	ComparableInterfaces product3 = new ComparableInterfaces(3.2, 12.0, 103);

        int result1 = product1.compareTo(product2);
        System.out.println("Comparison result between product1 and product2: " + result1);

        int result2 = product2.compareTo(product3);
        System.out.println("Comparison result between product2 and product3: " + result2);

        int result3 = product3.compareTo(product1);
        System.out.println("Comparison result between product3 and product1: " + result3);
    }
}
