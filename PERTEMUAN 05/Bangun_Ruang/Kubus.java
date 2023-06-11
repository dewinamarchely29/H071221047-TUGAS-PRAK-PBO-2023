package Bangun_Ruang;
class Kubus extends BangunRuang {
    double sisi;

    @Override
    public void hitungLuasPermukaan () {
        luasPermukaan = 6 * sisi * sisi;
    }

    @Override
    public void hitungVolume () {
        volume = sisi * sisi * sisi;
    }
}
