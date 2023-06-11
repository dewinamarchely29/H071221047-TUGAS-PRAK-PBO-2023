package NO2;

class PengurusInti extends Anggota {
    String jabatan ;

    public PengurusInti(String nama, int umur, String jenisKelamin, String alamat, String jabatan ) {
        super(nama, umur, jenisKelamin, alamat) ;
        this.jabatan = jabatan ;
    }

    public void detailsInfo() {
        super.detailsInfo(); 
        System.out.println(" Jabatan       : " + jabatan);
    }
}
