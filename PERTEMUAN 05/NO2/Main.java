package NO2;

public class Main {
    public static void main(String[] args) {
        PengurusInti peng_Inti = new PengurusInti("Dewina Marchely Kasenda", 20, "Perempuan" , "Jl. Sermani 1 No. 12", "Sekretaris") ;
        KoordinatorBidang koorbid = new KoordinatorBidang("Cole Sprouse", 28, "Laki-laki", "USA", "Koordinator acara") ;

        System.out.println(" Pengurus Inti ");
        peng_Inti.detailsInfo();
        System.out.println();

        System.out.println(" Koordinator Bidang ");
        koorbid.detailsInfo();
        System.out.println();
    }
}
