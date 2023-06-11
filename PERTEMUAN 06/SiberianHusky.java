// Class SiberianHusky yang merupakan subclass dari Dog
class SiberianHusky extends Dog {
    public SiberianHusky(int position, int averageLength) {
        super(position, averageLength);
    }
    
    public void move() {
        this.position += 2;
    }
    
    public void describe() {
        System.out.println("Siberian Husky adalah ras anjing yang tahan terhadap cuaca dingin dan mempunyai rambut tebal. Mereka sangat energik, setia, dan lembut.");
    }
}