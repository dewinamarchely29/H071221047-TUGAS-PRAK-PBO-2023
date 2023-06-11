// / Class GermanShepherd yang merupakan subclass dari Dog
class GermanShepherd extends Dog {
    
    public GermanShepherd(int position, int averageLength) {
        super(position, averageLength);
    }
    
    public void move() {
        this.position += 3;
    }
    
    public void describe() {
        System.out.println("German Shepherd adalah ras anjing yang cerdas dan tangguh. Mereka sangat setia dan dapat dilatih untuk berbagai tugas, termasuk penjagaan, pelacakan, dan pencarian dan penyelamatan.");
    }
}