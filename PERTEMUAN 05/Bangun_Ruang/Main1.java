package Bangun_Ruang;

import java.util.Scanner;

public class Main1 {

      public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in) ;
        // int input = sc.nextInt();
        // sc.nextLine();
        
        int pilihan = 0 ;
        // int pilihan = sc.nextInt();
        // sc.nextLine();
        
        

        while (pilihan != 4 ) {
            System.out.println("===BANGUN RUANG===");
            System.out.println(" 1. KUBUS");
            System.out.println(" 2. BALOK");
            System.out.println(" 3. BOLA");
            System.out.println(" 4. TABUNG");
            System.out.print("Pilih Bangun Ruang   : " );
            pilihan =  input.nextInt() ;
            

            
            switch (pilihan) {
                case 1 :
                    Kubus kubus = new Kubus () ;
                    System.out.print("Masukkan panjang sisi  : ");
                    kubus.sisi = input.nextDouble();
                    kubus.hitungLuasPermukaan();
                    kubus.hitungVolume();
                    kubus.tampilkanLuasPermukaan();
                    kubus.tampilkanVolume();
                    break ;

                case 2 :

                    System.out.print("Masukkan panjang balok : ");
                    double panjang = input.nextDouble() ;
                    System.out.print("Masukkan lebar balok : ");
                    double lebar = input.nextDouble();
                    System.out.print("Masukkan tinggi balok : ");
                    double tinggi = input.nextDouble();
                    Balok balok = new Balok(panjang, lebar, tinggi) ;
                    balok.hitungLuasPermukaan();
                    balok.hitungVolume();
                    balok.tampilkanLuasPermukaan();
                    balok.tampilkanVolume();
                    break ;

                case 3 : 
                    Bola bola = new Bola () ;
                    System.out.println("Masukkan Jari - Jari : ");
                    bola.JariJari = input.nextDouble();
                    bola.hitungLuasPermukaan();
                    bola.hitungVolume();
                    bola.tampilkanLuasPermukaan();
                    bola.tampilkanVolume();
                    break ; 
                
                case 4 : 
                    Tabung tabung = new Tabung();
                    System.out.print("Masukkan Jari - Jari : ");
                    // double JariJari = input.nextDouble();
                    tabung.JariJari = input.nextDouble();
                    System.out.print(" Masukkan Tinggi : ");
                    // double tinggii = input.nextDouble();
                    tabung.tinggii = input.nextDouble();
                    tabung.hitungLuasPermukaan();
                    tabung.hitungVolume();
                    tabung.tampilkanLuasPermukaan();
                    tabung.tampilkanVolume();
                    break ;       
        }

        while (pilihan != 5 ) {
            System.out.println("===BANGUN DATAR===");
            System.out.println(" 1. PERSEGI");
            System.out.println(" 2. PERSEGI PANJANG");
            System.out.println(" 3. LINGKARAN");
            System.out.println(" 4. SEGITIGA");
            System.out.println(" 5. TRAPESIUM");
            System.out.print("Pilih Bangun Datar : " );
            pilihan =  input.nextInt() ;   
            
            switch (pilihan) {
                // case 1 :
                //     Persegi persegi  = new Persegi () ;
                //     System.out.print("Masukkan panjang sisi : ");
                //     persegi.sisi = input.nextDouble();
                //     persegi.hitungLuas();
                //     persegi.hitungKeliling();
                //     persegi.tampilkanLuas();
                //     persegi.tampilkanKeliling();
                //     break ;
                
                case 2 : 
                PersegiPanjang persegipanjang = new PersegiPanjang() ;
                    System.out.print("Masukkan panjang : ");
                    // double panjang = input.nextDouble() ;
                    persegipanjang.panjang = input.nextDouble();
                    System.out.print("Masukkan lebar : ");
                    // double lebar = input.nextDouble();
                    persegipanjang.lebar = input.nextDouble();
                    
                    // persegipanjang.setLebar(lebar);
                    // persegipanjang.setPanjang(panjang);
                    persegipanjang.hitungLuas();
                    persegipanjang.hitungKeliling();
                    persegipanjang.tampilkanLuas();
                    persegipanjang.tampilkanKeliling();
                    break ;

                case 3 : 
                    Lingkaran lingkaran = new Lingkaran () ;
                    System.out.println("Masukkan Jari - Jari : ");
                    lingkaran.JariJari = input.nextDouble();
                    lingkaran.hitungLuas();
                    lingkaran.hitungKeliling();
                    lingkaran.tampilkanLuas();
                    lingkaran.tampilkanKeliling();
                    break ; 

                // case 4 : 
                //     System.out.print("Masukkan alas : ");
                //     double panjang = input.nextDouble() ;
                //     System.out.print("Masukkan tinggi : ");
                //     double lebar = input.nextDouble();
                //     System.out.print("Masukkan sisi 1 : ");
                //     double sisi1 = input.nextDouble() ;
                //     System.out.print("Masukkan sisi 2 : ");
                //     double sisi2 = input.nextDouble() ;
                //     System.out.print("Masukkan sisi 3 : ");
                //     double sisi3 = input.nextDouble() ;
                //     Segitiga segitiga = new Segitiga (alas, tinggi, sisi1, sisi2, sisi3) ;
                //     segitiga.hitungLuas();
                //     segitiga.hitungKeliling();
                //     segitiga.tampilkanLuas();
                //     segitiga.tampilkanKeliling();
                //     break ;
                
                // case 5 : 
                //     System.out.print("Masukkan rusuk atas : ");
                //     double rusukAtas = input.nextDouble() ;
                //     System.out.print("Masukkan rusuk bawah : ");
                //     double rusukBawah = input.nextDouble();
                //     System.out.print("Masukkan tinggi : ");
                //     double tinggi = input.nextDouble() ;
                //     System.out.print("Masukkan sisi 1 : ");
                //     double sisi1 = input.nextDouble() ;
                //     System.out.print("Masukkan sisi 2 : ");
                //     double sisi2 = input.nextDouble() ;
                //     Trapesium trapesium = new Trapesium (rusukAtas, rusukBawah, sisi1, sisi2, sisi3) ;
                //     segitiga.hitungLuas();
                //     segitiga.hitungKeliling();
                //     segitiga.tampilkanLuas();
                //     segitiga.tampilkanKeliling();
                //     break ;

                    
            }

            }
        }
    }
}
