//NOMOR 5
public class Mainnnn {
    public static void main(String[]args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "JL.Sermani 1 No.12";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Dewina Marchely Kasenda";
        mahasiswa.nim = "H071221047";
        
        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat().getAlamatLengkap());
    }
}


