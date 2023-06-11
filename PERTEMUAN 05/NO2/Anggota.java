package NO2;

public class Anggota {
    String nama ;
    int umur ;
    String jenisKelamin ;
    String alamat ;

    public Anggota(String nama, int umur, String jenisKelamin, String alamat) {
        this.nama = nama ;
        this.umur = umur ;
        this.alamat = alamat ;
        this.jenisKelamin = jenisKelamin;
    }

    public void detailsInfo () {
        System.out.println(" Nama          : " + nama);
        System.out.println(" Umur          : " + umur);
        System.out.println(" Jenis Kelamin : " + jenisKelamin);
        System.out.println(" Alamat        : " + alamat);
    }
   
}
