package Bangun_Ruang;
class Trapesium extends BangunDatar {
    double rusukAtas ;
    double rusukBawah ;
    double tinggi ;
    double sisi1 ;
    double sisi2 ;


    @Override
    public void hitungLuas () {
        luas = (rusukAtas + rusukBawah) * tinggi / 2 ;
    }

    @Override
    public void hitungKeliling () {
        keliling = rusukAtas + rusukBawah + sisi1 + sisi2 ;
    }
}
