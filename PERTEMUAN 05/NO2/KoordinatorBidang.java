package NO2;

class KoordinatorBidang extends Anggota {
    String bidang ;

    public KoordinatorBidang(String nama, int umur, String jenisKelamin, String alamat, String bidang) {
        super(nama, umur, jenisKelamin, alamat) ;
        this.bidang = bidang;
    }

    public void detailsInfo() {
        super.detailsInfo();
        System.out.println(" Bidang        : " + bidang );
    }
}