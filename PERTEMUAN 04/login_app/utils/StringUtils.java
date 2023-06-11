package login_app.utils;
public class StringUtils {

    //TODO_9

    public static String getNickName(String fullName) {
        String[] words = fullName.split(" ");
        if (words.length == 1) {
            return words[0];
        } else {
            return words[1];
        }
    }
     /*Pada contoh kode di atas, parameter fullName diterima sebagai argumen input. 
     Kemudian, kita memisahkan fullName menjadi array of String menggunakan metode split() 
     dengan separator spasi. Jika array memiliki panjang 1, artinya fullName hanya terdiri dari satu kata, 
     maka kita mengembalikan kata tersebut sebagai nickName. Namun, jika array memiliki panjang lebih da
     ri 1, artinya fullName terdiri dari dua kata atau lebih, maka kita mengembalikan kata kedua sebagai nickName.*/  
}
