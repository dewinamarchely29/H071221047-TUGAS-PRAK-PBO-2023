package login_app;

import java.util.ArrayList;
import java.util.Scanner;
import login_app.models.Profile;
import login_app.models.User;
import login_app.utils.StringUtils;

public class Main {
    private static ArrayList<User> listUser = new ArrayList<>();
    private static ArrayList<Profile> listUserProfile = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Memanggil method runApp();
        runApp();
    }

    private static void runApp() {
        // Menu Utama Aplikasi
        System.out.println("-------------------------");
        System.out.println("Aplikasi Login Sederhana");
        System.out.println("-------------------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.print("> ");

        // Menginput pilihan menu
        int selectMenu = sc.nextInt();
        sc.nextLine();
        switch (selectMenu) {
            case 1:
                // Membuka Halaman Login
                showLoginMenu();
                break;
            case 2:
                // Membuka Halaman Register
                showRegisterMenu();
            default:
                // Mengulang Pemanggilan Menu Utama
                runApp();
        }
    }

    private static void showLoginMenu() {
        // Halaman Login
        System.out.println("-------------------------");
        System.out.println("Login");
        // Menginput Username dan Menyimpannya di attribute username;
        System.out.println("Masukkan Username");
        System.out.print("> ");

        String username = sc.next();
        // Membuat variabel userIndex yang mana nanti akan menampung index dari user
        int userIndex = -1;
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getUsername().equals(username)) {
                userIndex = i; // jika username cocok, simpan indeks pengguna ke dalam userIndex
                break; // hentikan perulangan
              }
        }

        //TODO_1
        // Saat userIndex tidak sama dengan -1 atau userIndexnya ditemukan
        if (userIndex != -1) {
            // Menginput Password
            System.out.println("Password");
            System.out.print("> ");
            String password = sc.next();

            boolean isPasswordMatch = false; //inisialisasi isPasswordMatch dengan nilai false

        for (User user : listUser) {
            if (user.getUsername().equals(username) && user.getPassword() == Integer.parseInt(password)) {
                isPasswordMatch = true; //ubah nilai isPasswordMatch menjadi true apabila username dan password cocok
                break; //hentikan perulangan ketika ditemukan pengguna dengan username dan password yang cocok
            }
        }
           
            // Jika passwordnya sama maka berhasil login
            //TODO_2
            if (isPasswordMatch) {
                System.out.println("Berhasil Login");
             
            //TODO_3
                Profile loginUser = listUserProfile.get(userIndex);   
                // memanggil method showDetailUser dan mengirimkan loginUser sebagai parameter
                showDetailUser(loginUser);
                System.exit(0);
            } else {
                // saat password salah akan menampikan password salah
                System.out.println("Password Salah");
            }
        }
    }

    private static void showRegisterMenu() {
        System.out.println("-------------------------");
        System.out.println("REGISTER");

        // Menginput username dan password
        System.out.println("Username");
        System.out.print("> ");
        String username = sc.nextLine();
        System.out.println("Password");
        System.out.print("> ");
        String password = sc.nextLine();

        //TODO_4
        User newUser = new User(username, Integer.parseInt(password)); //membuat instance objek User baru dengan username dan password yang diinput
        // listUser.add(newUser); //menambahkan objek User baru ke dalam listUser    
      
        //TODO_5
        Profile profile = new Profile(); 
        
        // Menginput Data Profile
        System.out.println("Nama Lengkap");
        System.out.print("> ");
        String fullName = sc.nextLine();
        System.out.println("Umur");
        System.out.print("> ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Hobby");
        System.out.print("> ");
        String hobby = sc.nextLine();

        //TODO_6
        profile.setNamaLengkap(fullName);
        profile.setUmur(age);
        profile.setHobby(hobby);
        
       //TODO_7
        String nickName = StringUtils.getNickName(fullName);
        profile.setNickName(nickName);

        // Menambahkan user yang dibuat ke list user
        listUser.add(newUser);
        // Menambahkan profile user yang dibuat ke list profile
        listUserProfile.add(profile);
        System.out.println("-------------------------");
        System.out.println("Berhasil Membuat User Baru!!");
        runApp();
    }
    private static void showDetailUser(Profile profile) {
        
        //TODO_8
        System.out.println("Nama Lengkap : " + profile.getNamaLengkap());
        System.out.println("Nama Panggilan : " + profile.getNickName());
        System.out.println("Umur : " + profile.getUmur());
        System.out.println("Hobby : " + profile.getHobby());
    }
}
