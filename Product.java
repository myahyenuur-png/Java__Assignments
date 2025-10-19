public class Product {
    // Main method for testing
    public static void main(String[] args) {
        // Create two products with different prices and discount values
        Product product1 = new Product("01", "Laptop", 300.0, 15.0);
        Product product2 = new Product("02", "phone", 500.0, 10.0);
       //prit product 1
        System.out.println(" Product 1: " + product1.getName() );
        System.out.println("Product ID: " + product1.getId());
        System.out.println("Original Price: $" + product1.getPrice());
        System.out.println("Discount: " + product1.getDiscount() + "%");
        System.out.println("Price after discount: $" + product1.priceAfterDiscount());
        System.out.println("Final price with VAT: $" + product1.finalPrice());
        System.out.println();

        // Print product 2
        System.out.println("Product 2: " + product2.getName() );
        System.out.println("Product ID: " + product2.getId());
        System.out.println("Original Price: $" + product2.getPrice());
        System.out.println("Discount: " + product2.getDiscount() + "%");
        System.out.println("Price after discount: $" + product2.priceAfterDiscount());
        System.out.println("Final price with VAT: $" + product2.finalPrice());
        System.out.println();

        // display
        System.out.println(" Detailed Calculation ");
        displayProduct(product1);
        displayProduct(product2);

    }
    // Attributes
    private String id;
    private String name;
    private double price;
    private double discount;

    // Constructor to initialize all attributes
    public Product(String id, String name, double price, double discount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    // Getter methods
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    // Method to calculate price after discount
    public double priceAfterDiscount() {
        double discountAmount = price * (discount / 100);
        return price - discountAmount;
    }

    // Method to calculate final price with VAT
    public double finalPrice() {
        double discountedPrice = priceAfterDiscount();
        double vatAmount = discountedPrice * 0.05; // 5% VAT
        return discountedPrice + vatAmount;
    }

//display product
    private static void displayProduct(Product product) {
        System.out.printf("%s (ID: %s):Original price: $%.2f, After Discount: $%.2f, With Vat: $%.2f%n",
                product.getName(),
                product.getId(),
                product.getPrice(),
                product.priceAfterDiscount(),
                product.finalPrice());
    }
}