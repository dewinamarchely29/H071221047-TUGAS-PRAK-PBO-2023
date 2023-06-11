// Class Car yang mengimplementasikan interface Movable

class Car implements Movable {
    //Kode di atas adalah sebuah class bernama Car yang mengimplementasikan sebuah interface bernama Movable
    
    private int totalForwardGear;
    private String color;
    private int maxSpeed;
    
    //Class ini memiliki satu constructor yang menerima tiga parameter yaitu: totalForwardGear, 
    //color, dan maxSpeed. Constructor kemudian digunakan untuk menginisialisasi nilai dari
    // seluruh atribut tersebut
    public Car(int totalForwardGear, String color, int maxSpeed) {
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    
    //Selain itu, class Car juga memiliki dua method yaitu move() dan describe(). Method move() hanya mencetak pesan "Mobil sedang berakselerasi" ke dalam console. 
    //Sedangkan method describe() mencetak informasi lengkap mengenai mobil berupa 
    //totalForwardGear, color, dan maxSpeed ke dalam console.
    public void move() {
        System.out.println("\nMobil sedang berakselerasi");
    }
    public void describe () {
        System.out.printf("Mobil dengan %d gigi maju, berwarna %s, memiliki kecepatan maksimum  %d maxSpeed km/jam", totalForwardGear, color, maxSpeed);
    
    }
}
