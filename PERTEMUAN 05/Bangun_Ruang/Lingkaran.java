package Bangun_Ruang;
class Lingkaran extends BangunDatar{
    double JariJari;

    @Override
    public void hitungLuas () {
        luas = Math.PI * JariJari * JariJari;
    }

    @Override
    public void hitungKeliling () {
        keliling = 2 * Math.PI * JariJari ;
    }
}
