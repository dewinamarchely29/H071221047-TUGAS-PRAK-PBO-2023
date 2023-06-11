package Bangun_Ruang;
class Bola extends BangunRuang {
    double JariJari;

    @Override
    public void hitungLuasPermukaan () {
        luasPermukaan = 4 * Math.PI * JariJari * JariJari;
    }

    @Override
    public void hitungVolume () {
        volume = 4/3 * Math.PI * JariJari * JariJari * JariJari;
    }
}
