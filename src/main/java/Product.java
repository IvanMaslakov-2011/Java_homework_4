public class Product {

    private String name;
    private double price;
    private int quantity;

    public static void main(String[] args){
        Product product1 = new Product("Phone", -700.0, 40);
        product1.getTotalValue();
    }

    public Product(String name, double price, int quantity){
        this.name = name;
        setPrice(price);
    }

    public void setPrice(double price){
        if (price > 0){
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price має бути більше нуля!");
        }
    }

    public void setQuantity(int quantity){
        if (quantity >= 0){
            this.quantity = quantity;
        } else {
            throw new IllegalArgumentException("Quantity має бути не менше нуля!");
        }
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getTotalValue(){
        return price * quantity;
    }
}
