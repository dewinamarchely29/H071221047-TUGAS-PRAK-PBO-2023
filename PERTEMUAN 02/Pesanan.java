// public class Pesanan {
//     private String namaPesanan ;
//     private String alamatPemesanan;
//     private int totalHarga;

//     public Pesanan () {
//     }

//     public Pesanan (String namaPesanan, String alamatPemesanan, int totalHarga);
//         this namaPesanan = namaPesanan;
//         this.alamatPemesanan = alamatPemesanan;
//         this.totalHarga = totalHarga;
        

//     public String getNamaPesanan() {
//         return namaPesanan;
//     }
//     public void setNamaPesanan(String namaPesanan) {
//         this.namaPesanan = namaPesanan;
//     }
//     public String getAlamatPemesanan() {
//         return alamatPemesanan;
//     }
//     public void setAlamatPemesanan(String alamatPemesanan) {
//         this.alamatPemesanan = alamatPemesanan;
//     }
//     public int getTotalHarga() {
//         return totalHarga;
//     }
//     public void setTotalHarga(int totalHarga) {
//         this.totalHarga = totalHarga;
//     }
    
//     }

public class Pesanan {
    private String namaPesanan ;
    private String alamatPemesanan;
    private int totalHarga;

    public Pesanan () {
    }

    public Pesanan (String namaPesanan, String alamatPemesanan, int totalHarga) {
        this.namaPesanan = namaPesanan;
        this.alamatPemesanan = alamatPemesanan;
        this.totalHarga = totalHarga;
    }

    public String getNamaPesanan() {
        return namaPesanan;
    }
    public void setNamaPesanan(String namaPesanan) {
        this.namaPesanan = namaPesanan;
    }
    public String getAlamatPemesanan() {
        return alamatPemesanan;
    }
    public void setAlamatPemesanan(String alamatPemesanan) {
        this.alamatPemesanan = alamatPemesanan;
    }
    public int getTotalHarga() {
        return totalHarga;
    }
    public void setTotalHarga(int totalHarga) {
        this.totalHarga = totalHarga;
    }
}