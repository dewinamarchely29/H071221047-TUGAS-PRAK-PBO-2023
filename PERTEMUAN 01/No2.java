import java.util.Scanner;
// import java util scanner supaya kita bisa menginput variabel yang diinginkan 

public class No2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        //scanner input ini untuk menginput suatu inputan  
        int bilbulat = 0;
        // integer bilangan bulat disamadengankan nol 
        int bildesimal = 0;
        // integer bilangan desimal dimisalkan dengan nol 
        try {
        // disini kita menggunakan try dan except
        
            System.out.print("Masukkan jumlah bilangan yang akan diinput: ");
            int n = inp.nextInt();
            inp.nextLine();
            System.out.print("Silakan masukkan " + n + " bilangan:");

            for (int i = 0; i < n; i++) {
                double num = inp.nextDouble();
                if (num % 1 == 0) {
                    bilbulat++;
                    //++ bertambah 1
                    //
                } else {
                    bildesimal++;
                }
            }
            /* variabel i akan dijalankan sebanyak n kali. pada setiap iterasinya,
             * program akan meminta input bilangan dari pengguna dan menyimpannya sebagai "num", 
             * kemudian program akan mengecek apakah "num" merupakan bilangan bulat atau desimal melalui operator
             * modulus. jika hasil dari num % 1 tidak sama dengan 0, makan num adalah bilangan desimal dan variable
             * bildesimal akan bertambah 1. akhirnya, setelah perulangan selesai, program akan menghasilkan jumlah bilangan
             * bulat dan desimal yang diinput oleh pengguna. 
             */

            System.out.println(bilbulat + " Bilangan Bulat");
            System.out.println(bildesimal + " Bilangan Desimal");
            inp.close();
        } catch (Exception e) {
            System.out.println("Input harus berupa bilangan!");
        }
    }
}