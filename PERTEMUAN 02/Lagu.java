//NOMOR 1
public class Lagu {
    String judul;
    String artis;
    String album; 
    
    //pemanggilan objek yg berisikan method"
    public void judulLagu (String judulLagu) {
        judul = judulLagu;
    }
    public void artisLagu (String artisLagu) {
        artis = artisLagu;
    }
    public void albumLagu(String albumLagu){
        album = albumLagu;
    }
    
    
    //pengambilan objek
    public void detailLagu() {
        System.out.println("Judul Lagu : " + judul);
        System.out.println("Artis : " + artis);
        System.out.println("Album : " + album);
    }
     
    //panggil kembali
    public static void main(String[] args) {
    Lagu lagu = new Lagu();
    lagu.judulLagu("2112");
    lagu.artisLagu("Reality Club");
    lagu.albumLagu("Alexandra");
    lagu.detailLagu();
}
}



