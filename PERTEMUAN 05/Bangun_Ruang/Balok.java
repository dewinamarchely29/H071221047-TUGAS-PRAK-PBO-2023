package Bangun_Ruang;
class Balok extends BangunRuang {
    double panjang ;
    double lebar ;
    double tinggi ;

    Balok(double panjang, double lebar, double tinggi ) {
        this.panjang = panjang ;
        this.lebar = lebar ;
        this.tinggi = tinggi ;

    }

    @Override
    public void hitungLuasPermukaan () {
        luasPermukaan = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi) ;
    }

    @Override
    public void hitungVolume () {
        volume = panjang * lebar * tinggi;
    }
}

