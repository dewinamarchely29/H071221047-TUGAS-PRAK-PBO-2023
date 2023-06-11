// Abstract class untuk dog

//Kode ini merupakan sebuah abstract class untuk objek dog dengan dua atribut yaitu position dan averageLength. 
//class tersebut memiliki constructor untuk menginisialisasi nilai position dan averageLength, 
//dan memiliki dua method abstract yaitu move() dan describe(). 
//Method abstract sendiri adalah method yang tidak memiliki implementasi di dalam class abstract tersebut, 
//sehingga harus diimplementasikan di dalam subclass yang mewarisi class tersebut.

abstract class Dog {
    protected int position;
    protected int averageLength;
    //Ketika suatu class mengandung variabel/atribut/property yang hanya bisa diakses oleh class turunannya,
    // maka dapat menggunakan access modifier "protected". Penggunaan "protected" ini memungkinkan variabel 
    //dapat diakses oleh class itu sendiri dan juga class turunannya.
    //Pada contoh code yang disediakan, "protected" digunakan untuk mengatur akses variabel "position" dan "averageLength".
    // Ini berarti class turunan dapat mengakses dan memodifikasi variabel tersebut, sedangkan class-class lain 
    //di luar package tidak dapat mengakses.


    
    public Dog(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }
    
    public abstract void move();
    public abstract void describe();
}




