package Bangun_Ruang;
class Segitiga extends BangunDatar{
    double alas ;
    double tinggi ;
    double sisi1 ;
    double sisi2 ;
    double sisi3 ;

    @Override
    public void hitungLuas () {
        luas = 0.5 * alas * tinggi ;
    }

    @Override
    public void hitungKeliling () {
        keliling = sisi1 + sisi2 + sisi3;
    }
}
