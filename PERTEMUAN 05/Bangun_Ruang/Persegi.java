package Bangun_Ruang;
class Persegi extends BangunDatar {
    double sisi ;

    @Override
    public void hitungLuas () {
        luas = sisi * sisi;
    }

    @Override
    public void hitungKeliling () {
        keliling = 4 * sisi ;
    }
} 
