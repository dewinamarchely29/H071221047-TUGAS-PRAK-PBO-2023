package Bangun_Ruang;
class Tabung extends BangunRuang{
    double JariJari;
    double tinggii;

    // public Tabung(double jariJari2, double tinggii2) {
    // }

    @Override
    public void hitungLuasPermukaan () {
        luasPermukaan = 2 * Math.PI * JariJari * tinggii;
    }

    @Override
    public void hitungVolume () {
        volume = Math.PI * JariJari * JariJari * tinggii;
    }
}
    

