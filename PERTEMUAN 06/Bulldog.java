// Class Bulldog yang merupakan subclass dari Dog
class Bulldog extends Dog {
    
    public Bulldog(int position, int averageLength) {
        super(position, averageLength);
    }
    
    public void move() {
        this.position += 1;
    }
    
    public void describe() {
        System.out.println("Bulldog adalah ras anjing yang memiliki kepala besar dan badan yang kuat. Mereka dikenal sebagai anjing yang setia dan pemberani, tetapi cenderung kurang aktif.");
    }
}