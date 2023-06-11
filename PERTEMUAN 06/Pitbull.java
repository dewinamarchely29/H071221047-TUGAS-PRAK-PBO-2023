// Pitbull subclass
// Class Pitbull yang merupakan subclass dari Dog
class Pitbull extends Dog{
    public Pitbull(int position, int averageLength) {
        super(position, averageLength);
    }
    
    public void move() {
        this.position += 3;
    }
    
    public void describe() {
        System.out.println("Pitbull adalah ras anjing yang kuat, gesit, dan agresif. Mereka memiliki bentuk kepala yang khas dengan rahang kuat dan gigi yang tajam.");
    }
}