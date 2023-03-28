public class No7 {
    // Inisialisasi array dengan data buah
    private String[] data = {"apel", "jeruk", "mangga", "anggur", "pisang", "semangka", "durian"};
    //private string = Private adalah kode yang sesuai dengan namanya, akses ini bersifat private. dengan kata lain data maupun method hanya dapat diakses oleh kelas yang dimilikinya saja.
    
    public int findIndex(String text) {
    //find index berfungsi untuk menemukan suatu indeks
        // Konversi teks ke huruf kecil agar case-insensitive
        text = text.toLowerCase();
    
            // Cari indeks teks dalam array
            for (int i = 0; i < data.length; i++) {
                if (data[i].toLowerCase().equals(text)) {
                    return i;
                }
            }
            // dimisalkan data indeks ke - i = o
            // Jika teks tidak ditemukan, kembalikan -1
            return -1;
        }
    
        public static void main(String[] args) {
            // Membuat objek StringArrayExample
            No7 example = new No7();
    
            // Cari indeks teks dalam array
            System.out.println("Indeks dari 'anggur': " + example.findIndex("anggur"));
            System.out.println("Indeks dari 'mangga': " + example.findIndex("mangga"));
    
            // Cari indeks teks yang tidak ada dalam array
            System.out.println("Indeks dari 'apel hijau': " + example.findIndex("apel hijau"));
        }
}    
