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
        //Substring : mengambil nilai dari suatu string
        //length : panjang dri string
        // parseInt : awlanya string
        int number = inputNIMint % 7;
        // 
        System.out.println(number == 0 ? "Soal: no 7" : "Soal : no " + number);
        inp.close();
    }
}