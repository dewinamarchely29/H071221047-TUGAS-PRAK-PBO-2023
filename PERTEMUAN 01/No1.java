import java.util.Scanner;
// memasukkan paket scanner
// scanner utk menginputkan data/nilai saat program di running

public class No1 {
    public static void main(String[] args) {
        // sebuah method utk menjalankan program
        Scanner inp = new Scanner(System.in);
        // variabel input akan berisi object dari scanner class
        System.out.print("NIM : ");
        String inputNIM = inp.nextLine();
        int inputNIMint = Integer.parseInt(inputNIM.substring(inputNIM.length() - 3));
        /*kode ini mengubah 3 karakter terakhir dari string inputNIM menjadi integer, dan menyimpan nilainya
         * dalam variabel inputNIMint. fungsi substring () digunakan untuk mendapatkan substring dari inputNIM yg
         * dimulai dari indeks inputNIM.length() - 3 sampai indeks terakhir inputNIM, kemudian fungsi Integer.parseInt()
         * digunakan untuk mengubah hasil substring menjadi integer. 
         */
        int number = inputNIMint % 7;
        // 
        System.out.println(number == 0 ? "Soal: no 7" : "Soal : no " + number);
        inp.close();
    }
}