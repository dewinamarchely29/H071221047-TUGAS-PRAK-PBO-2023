//Nomor 4
class Cuboid {
    double height;
    double width;
    double length;
    //double itu tipe data desimal

    double getVolume() {
        //get volume itu untuk mengembalikan nilai pada volume (rumus volume : pxlxt)
        // get selalu berpasangan dengan return
        return height * width * length; 
        //return disini itu untuk mengembalikan nilai dari volumenya
    }
}

public class Main {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
       
        // cuboid = variabel baru dari class Cuboid
        //pemanggilan objek dari cuboid sehingga ada nilai dari height width length
        cuboid.height = 5 ; 
        cuboid.width = 10 ;
        cuboid.length = 15 ;

        System.out.println(cuboid.height);

        System.out.printf("Volume = %.2f", cuboid.getVolume());
        //%2f supaya hasil dari print nya memuat 2 angka dibelakang koma
    }
}



