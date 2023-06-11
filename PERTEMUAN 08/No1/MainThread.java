package No1;

import java.util.concurrent.ExecutorService;
/* Ini berarti program tersebut akan menggunakan fitur dari Java Concurrency API 
untuk melakukan manajemen task yang akan dieksekusi secara paralel oleh beberapa thread dalam ExecutorService.*/

/* ExecutorService adalah salah satu class yang terdapat pada Java Concurrency API 
yang memberikan fitur untuk melakukan manajemen task yang akan dieksekusi secara paralel 
oleh beberapa thread. */

import java.util.concurrent.Executors;
/* Program tersebut memuat import statement untuk kelas Executors dari package java.util.concurrent.
Kelas ini digunakan untuk membuat instance dari ExecutorService interface, 
 yang dapat digunakan untuk membuat thread pool dan mengeksekusi task secara paralel.  */

/* Thread pool adalah sekumpulan thread yang sudah dibuat sebelumnya dan disiapkan
 untuk mengeksekusi tugas (task) yang dikirimkan ke dalam antrian tugas (task queue). */

public class MainThread {
    private static final int DATA_SOURCES = 4;
    /* menunjukkan bahwa ada 4 sumber data yang akan dimuat pada program.*/

    private static final int THREAD_POOLS = 3;
    // maksudnya program akan menggunakan 3 thread pool utk mengatur 3 klp proses atau tugas yg berbeda.

    private static int successLoadData = 0;
    /* Variabel successLoadData adalah variabel statik dari tipe data int, 
    yang digunakan untuk menyimpan jumlah data yang berhasil dimuat atau diakses oleh program. 
    Nilai awal variabel adalah nol, dan nilai variabel akan ditambah setiap kali program 
    berhasil memuat atau mengakses data tertentu. Variabel ini dapat digunakan untuk mengetahui 
    performa program dalam memuat atau mengakses data. */

    private static int failedLoadData = 0;
    /* Variabel failedLoadData diinisialisasi dengan nilai 0 pada saat deklarasinya
    karena belum ada kegagalan memuat atau mengakses data pada awal program dijalankan 
    sehingga nilai awal variabel tersebut adalah 0. Ini juga memastikan bahwa setiap kali program dijalankan,
    variabel failedLoadData akan selalu dimulai dari nilai 0. */

    private static boolean isFinished = false;
    /* Variabel isFinished adalah sebuah variabel boolean (true/false) dengan hak akses private yang 
    digunakan dalam sebuah class. Nilai awal variabel ini diinisialisasi dengan false
    karena pada awalnya belum ada kondisi bahwa program sudah selesai.
    Variabel ini dapat berubah nilainya selama program berjalan tergantung pada kondisi yang
    diterapkan pada program, dan biasanya digunakan dalam sebuah loop atau proses yang berulang 
    untuk menentukan apakah sebuah proses telah selesai atau belum. */

    public static void main(String[] args) {
        System.out.println(String.format("Start load %d Data", DATA_SOURCES));

        ExecutorService executor = Executors.newFixedThreadPool(THREAD_POOLS);
        /* Kode tersebut digunakan untuk membuat sebuah object ExecutorService yang akan digunakan 
        untuk mengatur pemakaian thread pada sebuah program. Executors.newFixedThreadPool() 
        digunakan untuk membuat thread pool dengan jumlah thread tetap yang disesuaikan dengan nilai
        dari THREAD_POOLS yang telah ditetapkan sebelumnya. 
        Dengan menggunakan object ExecutorService, programmer dapat melakukan eksekusi task 
        pada background threads secara efisien dan terstruktur.*/


        for (int i = 0; i < DATA_SOURCES; i++) {
            //Pada baris tersebut, program akan melakukan loop dari nilai awal 0 hingga kurang dari nilai
            // konstanta DATA_SOURCES dengan increment sebanyak 1 pada setiap iterasi.

            // Membuat Thread sebagai anonymous class
            executor.execute(() -> {
                int executionTime = TaskTimeHelper.getRandomNumber();
                // Karena permintaan soal mengatakan jika waktu eksekusi data sources lebih dari 4 detik, maka dianggap gagal
                if (executionTime > 4) {
                    System.out.println("Request Timeout");
                    // Berarti jumlah data yang tidak berhasil diakses pun bertambah 1
                    incrementFailedLoadData();
                    return;
                } else {
                    try {
                        // Thread akan nganggur karena ceritanya ini sedang mengakses data sources
                        Thread.sleep(executionTime * 1000);
                        // Setelah turu, maka dinyatakan valid telah menyelesaikan tugas sehingga jumlah data yang berhasil diakses ditambah 1
                        incrementSuccessLoadData();
                    } catch (InterruptedException e) {
                        // Ini kalau error ygy
                        incrementFailedLoadData();
                        System.out.println("Request Timeout");
                    }
                }
                checkDataLoadingStatus();
                //method ini digunakan utk memeriksa atau mengecek status atau kondisi dari proses loading atau prngambilan data.
            });
        }

        // Ketika semua Thread sudah selesai menjalankan tugas, maka executor akan di-shutdown.
        //Kode "executor.shutdown();" akan mematikan atau menghentikan layanan executor yang sebelumnya dibuat dalam kode. 
        executor.shutdown();

        // UI Thread
        int loadingTime = 1;
        while (true) {
            if (isFinished) {
                System.out.println("\nTask Finished.");
                // Dikurang satu supaya pas print out hasil itu pas dengan hitungan detik terakhir sebelum semua Thread selesai bekerja
                System.out.println(String.format("Time Execution : %ds", loadingTime - 1));
                if (successLoadData == DATA_SOURCES) {
                    System.out.println("All data is successfully loaded");
                    break;
                } else {
                    System.out.println(String.format("%d Data Successfully loaded & %d Data Failed to load", successLoadData, failedLoadData));
                    break;
                }
            } else {
                System.out.println(String.format("Loading... (%ds)", loadingTime));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            loadingTime++;
        }
    }

    // synchronized ditambahkan untuk menjaga method agar dalam 1 waktu, hanya 1 Thread yang bisa mengaksesnya. Ini untuk menghindari adanya race condition maupun deadlock
    public static synchronized void incrementSuccessLoadData() {
        successLoadData++;
    }

    public static synchronized void incrementFailedLoadData() {
        failedLoadData++;
    }

    public static synchronized void checkDataLoadingStatus() {
        if (successLoadData + failedLoadData == DATA_SOURCES) {
            isFinished = true;
        }
        // System.out.println("CEK KONDISI GAN");
    }
}
