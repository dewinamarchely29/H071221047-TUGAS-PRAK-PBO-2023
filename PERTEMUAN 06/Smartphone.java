// Class Smartphone yang mengimplementasikan interface Movable
class Smartphone implements Movable {
    private int price;
    private String brand;
    
    public Smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }
    
    public void describe() {
        System.out.printf("Smartphone %s memiliki harga %d rupiah", brand, price);
    }
    public void move() {
        System.out.println("Smartphone berpindah");
    }
}