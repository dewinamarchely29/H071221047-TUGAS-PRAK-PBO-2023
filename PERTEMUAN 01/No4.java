import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String kalimat = inp.nextLine();
        String[] kata = kalimat.toLowerCase().split(" ");
        //split dan regex ; ambil kata dan spasi
        String kalimatBaru = "";
        
        for (int i = 0; i < kata.length; i++) {
            kalimatBaru += kata[i].substring(0, 1).toUpperCase() + kata[i].substring(1) + " ";
        }
        System.out.println("Kalimat setelah diubah: " + kalimatBaru.trim());
        //trim = mmendapatkan spasi
        inp.close();
    }
}