
import java.text.DateFormat;
//untuk memformat tanggalnya
import java.text.ParseException;
//pengecualian saat mencoba kode data tanggal
import java.text.SimpleDateFormat;
//utk menampilkan format tanggal hari ini 
import java.util.Scanner;
//memasukkan paket data scanner 

public class No5 {
    public static void main(String[] args) throws ParseException {
        Scanner inp = new Scanner(System.in);
        //scanner inp utk input tanggal
        String tglLama = inp.nextLine(); 
        // utk memasukkan tgl input dari soal, nextline karena dia string
        DateFormat dateFormat = new SimpleDateFormat("d MMMM yyyy");
        //memunculkan format tanggal baru pake pattern  sesuai yg diinginkan output
        DateFormat df=new SimpleDateFormat("d-MM-yy");
        //munculkan format tgl lama
        String tglBaru=dateFormat.format(df.parse(tglLama));
            System.out.println(tglBaru);
        //print tgl barunya 
    }
}

