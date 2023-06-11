package Bangun_Ruang;
class PersegiPanjang  extends BangunDatar{
    public double panjang;
    public double lebar;

    // public PersegiPanjang(double panjang, double lebar) {
    //     this.panjang = panjang;
    //     this.lebar = lebar;
    // }

    // public void setPanjang(double panjang) {
    //     this.panjang = panjang;
    // }

    // public double getPanjang() {
    //     return this.panjang;
    // }

    // public void setLebar(double lebar) {
    //     this.lebar = lebar;
    // }

    // public double getLebar() {
    //     return this.lebar;
    // }

    @Override
    public void hitungLuas () {
        // luas = getLebar() * getPanjang();
        luas = lebar * panjang;
    }

    @Override
    public void hitungKeliling () {
        keliling = 2 * panjang + 2 * lebar ;
    }
}
