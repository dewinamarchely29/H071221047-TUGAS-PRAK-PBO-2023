package No1;

import java.util.Random;

public class TaskTimeHelper {
    public static int getRandomNumber() {
        //getRandomNumber bertujuan untuk menghasilkan nomor acak antara 1 dan 6
        Random random = new Random();
        //class random untuk menghasilkan angka acak
        
        return random.nextInt(6) + 1;
        //nextInt digunakan utk menghasilkan angka integer acak antara 0 dan 5(inklusif) krn itu angka 1 hrs ditambahkan 
        //agar angka yg dihasilkan menjadi antara 1 dan 6 (inklusif)
    }
}
