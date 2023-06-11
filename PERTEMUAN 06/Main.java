public class Main {
    public static void main(String[] args) {
        // Membuat objek dari salah satu class Dog
        SiberianHusky siberianHusky = new SiberianHusky(0, 25);
        // Memanggil method move() pada objek Dog
        siberianHusky.move();
        System.out.println("Posisi Siberian Husky: " + siberianHusky.position);
        // Memanggil method describe() pada objek Dog
        siberianHusky.describe();
        
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        // Membuat objek-objek dari class Smartphone dan Car
        Smartphone smartphone = new Smartphone(5000000, "Samsung");
        Car car = new Car(6, "hitam", 200);
        
        // Memanggil method move() dan describe() pada objek-objek Smartphone dan Car
        smartphone.move();
        smartphone.describe();
    
        car.move();
        car.describe();
    }
}