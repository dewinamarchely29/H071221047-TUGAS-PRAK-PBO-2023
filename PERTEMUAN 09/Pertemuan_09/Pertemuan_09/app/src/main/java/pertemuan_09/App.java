package pertemuan_09;

//membuat aplikasi GUI(Graphical User Interface)
//yaitu antarmuka pengguna berbasis grafis pada aplikasi komputer yang memungkinkan pengguna berinteraksi 
//dengan perangkat lunak melalui elemen-elemen visual seperti tombol, menu, kotak teks, gambar dan sebagainya.
import javafx.application.Application;

//Kelas yang berisi konstanta-konstanta yang diperlukan untuk menentukan letak dan tata letak objek GUI.
import javafx.geometry.Pos;

//Scene: Kelas yang merepresentasikan satu "layar" pada aplikasi GUI, yang berisi semua elemen GUI.
import javafx.scene.Scene;

//Kelas yang merepresentasikan elemen-elemen kontrol seperti tombol, label, dan teks field pada aplikasi GUI.
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

//kelas yg merepresentasikan gambar
import javafx.scene.image.Image;

//ImageView: Kelas yang merepresentasikan tampilan gambar pada aplikasi GUI.
import javafx.scene.image.ImageView;

//Kelas yang berisi layout-container seperti HBox dan VBox yang digunakan untuk menata elemen-elemen GUI pada aplikasi.
//HBox digunakan untuk menempatkan elemen-elemen secara horizontal (berderet),
import javafx.scene.layout.HBox;
//VBox digunakan untuk menempatkan elemen-elemen secara vertikal (berkolom). 
import javafx.scene.layout.VBox;

//Kelas yang merepresentasikan teks pada aplikasi GUI. Kelas ini digunakan untuk menentukan font untuk teks tersebut.
import javafx.scene.text.Font;

//Kelas yang merepresentasikan jendela di aplikasi GUI, yang berisi satu atau beberapa scene.
import javafx.stage.Stage;

public class App extends Application {
    private Stage stage;

    //menampilkan antarmuka pengguna utama aplikasi GUI pada JavaFX.
    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        showFirstScene();
        stage.show();
    }

    /* implementasi dari method showFirstScene, dimana di dalamnya akan membuat ImageView yang menampilkan 
    gambar dari sebuah file dengan nama icon.jpeg, sebuah Label dengan teks "Tugas Praktikum 9" dan font 
    HARRINGTON berukuran 25. Kemudian menambahkan button dengan teks "Mulai", 
    dimana saat tombol tersebut ditekan, akan memanggil method showSecondScene. */
    public void showFirstScene() {
        Image image = new Image("/icon.jpeg");
        ImageView imageView = new ImageView(image);

        Label label = new Label("Tugas Praktikum 9");
        label.setFont(Font.font("HARRINGTON", 25));

        Button button1 = new Button("Mulai");
        button1.getStyleClass().add("custom-button1");
        button1.setOnAction(action -> {
            showSecondScene();
        });

        /*tampilan ini nanti tersebut terdiri dari beberapa elemen seperti gambar (imageView), teks (label), 
        dan tombol (button1). Elemen tersebut ditempatkan pada VBox (Vertical box) dengan jarak
        antara elemen sebesar 15 dan di tengah-tengah layar. Kemudian VBox dimasukkan ke dalam 
        sebuah scene (scene1) dengan ukuran 300x400 serta menggunakan file stylesheet (style.css) 
        sebagai penentu gaya tampilan. Terakhir, scene1 digunakan sebagai tampilan utama pada stage 
        (jendela aplikasi). */

        VBox vBox = new VBox(imageView, label, button1);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(15);
        Scene scene1 = new Scene(vBox, 300, 400);
        scene1.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        stage.setScene(scene1);

    }

    /*tampilan tersebut terdiri dari teks label "Pilih Menu" dengan ukuran font 25px 
    serta dua buah tombol dengan teks "Aritmatika Dasar" dan "Operasi Kubus". Tombol-tombol tersebut 
    akan berfungsi untuk mengeksekusi method showBasicMath() dan showKubus() saat ditekan.
    Kode juga menambahkan gaya tampilan khusus pada tombol-tombol tersebut dengan menggunakan file stylesheet (CSS). */
    public void showSecondScene() {
        Label label = new Label("Pilih Menu");
        label.setFont(Font.font("ELEPHANT", 25));

        Button basic = new Button("Aritmatika Dasar");
        basic.getStyleClass().add("custom-button1");
        basic.setOnAction(action -> {
            showBasicMath();
        });
                
        Button kubus = new Button("Operasi Kubus");
        kubus.getStyleClass().add("custom-button1");
        kubus.setOnAction(action -> {
            showKubus();
        });

        /*Kode ini membuat sebuah tampilan di aplikasi berbasis JavaFX yang terdiri dari tiga elemen:
        sebuah label, tombol "Aritmatika Dasar" dan tombol "Operasi Kubus". Setelahnya, kode 
        menetapkan beberapa gaya tampilan khusus pada tombol-tombol tersebut menggunakan file stylesheet. 
        Selanjutnya, kode membuat sebuah scene (atau tampilan halaman) yang dimasukkan ke dalam
        VBox (Vertical Box) dan menetapkan ukuran tampilan tersebut. Terakhir, tampilan tersebut diset 
        menjadi tampilan utama di JavaFX stage. */
        VBox vBox = new VBox(label, basic, kubus);
        vBox.setAlignment(Pos.TOP_CENTER);
        vBox.setSpacing(15);
        Scene scene2 = new Scene(vBox, 300, 400);
        scene2.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        stage.setScene(scene2);
    }

    public void showBasicMath() {
        Label label = new Label("Aritmatika Dasar");
        label.setFont(Font.font("ELEPHANT", 25));

        TextField input1 = new TextField();
        input1.setPromptText("Input angka");
        TextField input2 = new TextField();
        input2.setPromptText("Input angka");

        Label output = new Label();

        Button tambah = new Button("+");
        tambah.getStyleClass().add("custom-button3");
        tambah.setOnAction(action -> {
            try {
                int angka1 = Integer.parseInt(input1.getText());
                int angka2 = Integer.parseInt(input2.getText());
                int hasil = angka1 + angka2;
                output.setText("Hasil = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan integer");
            }
        });

        Button kurang = new Button("-");
        kurang.getStyleClass().add("custom-button3");
        kurang.setOnAction(action -> {
            try {
                int angka1 = Integer.parseInt(input1.getText());
                int angka2 = Integer.parseInt(input2.getText());
                int hasil = angka1 - angka2;
                output.setText("Hasil = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan integer");
            }
        });

        HBox tambahKurang = new HBox(tambah, kurang);
        tambahKurang.setSpacing(10);
        tambahKurang.setAlignment(Pos.CENTER);

        Button kali = new Button("x");
        kali.getStyleClass().add("custom-button3");
        kali.setOnAction(action -> {
            try {
                int angka1 = Integer.parseInt(input1.getText());
                int angka2 = Integer.parseInt(input2.getText());
                int hasil = angka1 * angka2;
                output.setText("Hasil = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan integer");
            }
        });

        Button bagi = new Button("/");
        bagi.getStyleClass().add("custom-button3");
        bagi.setOnAction(action -> {
            try {
                int angka1 = Integer.parseInt(input1.getText());
                int angka2 = Integer.parseInt(input2.getText());
                Double hasil = (double) angka1 / angka2;
                output.setText("Hasil = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan integer");
            }
        });

        HBox kaliBagi = new HBox(kali, bagi);
        kaliBagi.setSpacing(10);
        kaliBagi.setAlignment(Pos.CENTER);  
        

        VBox tambahKurangKaliBagi = new VBox(tambahKurang, kaliBagi);
        tambahKurangKaliBagi.setAlignment(Pos.CENTER);
        tambahKurangKaliBagi.setSpacing(10);
        tambahKurangKaliBagi.setAlignment(Pos.CENTER);

        Button clear = new Button("Clear");
        clear.getStyleClass().add("custom-button1");
        clear.setOnAction(action -> {
            input1.setText("");
            input2.setText("");
        });

        Button back = new Button("Kembali");
        back.getStyleClass().add("custom-button2");
        back.setOnAction(action -> {
            showSecondScene();
        });

        VBox vBox = new VBox(label, input1, input2, output, tambahKurangKaliBagi, clear, back);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(15);
        Scene scene3 = new Scene(vBox, 300, 400);
        scene3.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        stage.setScene(scene3);
    }

    public void showKubus() {
        Label label = new Label("Operasi Kubus");
        label.setFont(Font.font("ELEPHANT", 25));

        Label label2 = new Label("Masukkan panjang rusuk :");
        TextField input = new TextField();
        Label output = new Label();

        Button keliling = new Button("Keliling");
        keliling.getStyleClass().add("custom-button3");
        keliling.setOnAction(action -> {
            try {
                int angka = Integer.parseInt(input.getText());
                int hasil = 12 * angka;
                output.setText("Hasil = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan integer");
            }
        });

        Button luas = new Button("Luas");
        luas.getStyleClass().add("custom-button3");
        luas.setOnAction(action -> {
            try {
                int angka = Integer.parseInt(input.getText());
                int hasil = 6 * (angka*angka);
                output.setText("Hasil = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan integer");
            }
        });

        HBox luke = new HBox(keliling, luas);
        luke.setSpacing(5);
        luke. setAlignment(Pos.CENTER);

        Button volume = new Button("Volume");
        volume.getStyleClass().add("custom-button4");
        volume.setOnAction(action -> {
            try {
                int angka = Integer.parseInt(input.getText());
                int hasil = angka*angka*angka;
                output.setText("Hasil = " + hasil);
            } catch (NumberFormatException e) {
                output.setText("Bukan integer");
            }
        });

        VBox lukevo = new VBox(luke, volume);
        lukevo.setSpacing(5);
        lukevo.setAlignment(Pos.CENTER);

        Button clear = new Button("Clear");
        clear.getStyleClass().add("custom-button1");
        clear.setOnAction(action -> {
            input.setText("");
        });

        Button back = new Button("Kembali");
        back.getStyleClass().add("custom-button2");
        back.setOnAction(action -> {
            showSecondScene();
        });

        VBox vBox = new VBox(label, label2, input, output, lukevo, clear, back);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(15);
        Scene scene3 = new Scene(vBox, 300, 400);
        scene3.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());
        stage.setScene(scene3);
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}

